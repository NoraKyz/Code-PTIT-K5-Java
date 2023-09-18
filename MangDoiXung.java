import java.util.*;

public class MangDoiXung {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long t = sc.nextLong();
    while(t-- > 0) {
      long[] a = new long[1000];
      long n = sc.nextLong();
      for (int i = 1; i <= n; i++) {
        a[i] = sc.nextLong();      
      }
      System.out.println(solve(a, n));
    }

    sc.close();
  }

  public static String solve(long[] a, long n) {
    for (int i = 1; i <= n / 2; i++) {
      if (a[i] != a[(int) n - i + 1]) {
        return "NO";
      }
    }

    return "YES";
  }
}