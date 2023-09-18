import java.util.*;

public class SoTamPhan {

  public static void main(String[] args) {
    long n, t;
    Scanner sc = new Scanner(System.in);

    t = sc.nextLong();
    for (int i = 1; i <= t; i++) {
      n = sc.nextLong();
      System.out.println(solve(Long.toString(n)));
    }

    sc.close();
  }

  public static String solve(String n) {
    for(int i = 0; i < n.length(); i++) {
      if(n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2') {
        return "NO";
      }
    }

    return "YES";
  }
}