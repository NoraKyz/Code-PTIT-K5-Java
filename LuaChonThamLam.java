import java.util.*;

public class LuaChonThamLam {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int s = sc.nextInt();

    System.out.println(solve(n, s));

    sc.close();
  }

  public static String solve(int n, int s) {
    if (n * 9 < s || s == 0)
      return "-1 -1";

    String min = "", max = "";

    int sum = s;
    for (int i = 0; i < n; i++) {
      int digit = Math.min(sum, 9);
      max += digit;
      sum -= digit;
    }

    sum = s;
    int cnt = s / 9;

    if (cnt + 1 < n) {
      min += 1;
      sum = (sum - 1) % 9;
      for (int i = 0; i < n - cnt - 2; i++) {
        min += 0;
      }
      min += sum;
      for (int i = 0; i < cnt; i++) {
        min += 9;
      }
    } else {
      sum = sum % 9;
      
      if (sum != 0) {
        min += sum;
      }

      for (int i = 0; i < n - cnt - 1; i++) {
        min += 0;
      }
      for (int i = 0; i < cnt; i++) {
        min += 9;
      }
    }

    return min + " " + max;
  }
}