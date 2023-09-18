import java.util.*;

public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {

  static long gcd(long a, long b) {
    while (b != 0) {
      long t = a;
      a = b;
      b = t % b;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      long result = 1;

      for (int j = 2; j <= n; j++) {
        result = (result * j) / gcd(j, result);
      }

      System.out.println(result);
    }

    sc.close();
  }
}