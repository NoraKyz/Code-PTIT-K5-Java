import java.util.*;

public class TinhLuyThua {

  public static void main(String[] args) {
    long a, b;
    Scanner sc = new Scanner(System.in);

    while(true) {
      a = sc.nextLong();
      b = sc.nextLong();

      if(a == 0 && b == 0) {
        break;
      }

      System.out.println(solve(a,b));   
    }

    sc.close();
  }

  public static long solve(long a, long b){
    if(b == 0) return 1;

    long res = solve(a, b/2) % 1000000007;
    res = res * res % 1000000007;

    if(b % 2 == 0) {
      return res % 1000000007;
    } else {
      return res * a % 1000000007;
    }
  }
}