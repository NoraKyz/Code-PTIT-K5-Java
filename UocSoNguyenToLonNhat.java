import java.util.*;

public class UocSoNguyenToLonNhat {

  public static void main(String[] args) {
    Long n, t;
    Scanner sc = new Scanner(System.in);

    t = sc.nextLong();
    for (int i = 1; i <= t; i++) {
      n = sc.nextLong();
      
      System.out.println(solve(n));
    }

    sc.close();
  }

  public static Long solve(Long n) {
    Long i = 2L, res = 0L;
    while(i * i <= n) {
      if (n % i == 0) {
        n /= i;
        res = Math.max(res, i);
      } else {
        i++;
      }
    }

    if(n > 1) res = Math.max(res, n);

    return res;
  }
}