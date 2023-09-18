import java.util.*;

public class UocSoChiaHetCho2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n, t;

    t = sc.nextInt();
    while (t-- > 0) {
      n = sc.nextInt();
      solve(n);
    }

    sc.close();
  }

  public static void solve(Integer n) {
    int count = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        if (i % 2 == 0) {
          count++;
        }

        if ((n / i) % 2 == 0 && i * i != n) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}