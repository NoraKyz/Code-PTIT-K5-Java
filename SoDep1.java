import java.util.*;

public class SoDep1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= t; i++) {
      String n = sc.nextLine();
      System.out.println(solve(n));
    }

    sc.close();
  }

  public static String solve(String n) {  
    for (int i = 0; i < n.length() / 2; i++) {
      if (n.charAt(i) != n.charAt(n.length() - i - 1) || n.charAt(i) % 2 == 1) {
        return "NO";
      }
    }

    if (n.charAt(n.length() / 2) % 2 == 1) {
      return "NO";
    }

    return "YES";
  }
}