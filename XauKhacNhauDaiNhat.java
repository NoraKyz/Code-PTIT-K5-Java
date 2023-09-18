import java.util.*;

public class XauKhacNhauDaiNhat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String a = sc.nextLine();
      String b = sc.nextLine();

      System.out.println(solve(a, b));
    }

    sc.close();
  }

  public static int solve(String a, String b) {
    if(a.equals(b)) return -1;
    return Math.max(a.length(), b.length());
  }
}