import java.util.*;
import java.io.*;

class Pair<S, T> {
  private T first;
  private S second;

  public Pair(T first, S second) {
    this.first = first;
    this.second = second;
  }

  public boolean check(int n) {
    int sqr = (int) Math.sqrt(n);
    for (int i = 2; i <= sqr; ++i)
      if (n % i == 0)
        return false;
    return true;
  }

  public boolean isPrime() {
    return check((Integer) this.first) && check((Integer) this.second);
  }

  @Override
  public String toString() {
    return String.format("%s %s", this.first, this.second);
  }
}

public class LopPair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      boolean check = false;
      for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
        Pair<Integer, Integer> p = new Pair<>(i, n - i);
        if (p.isPrime()) {
          System.out.println(p);
          check = true;
          break;
        }
      }
      if (!check)
        System.out.println(-1);
    }
  }
}