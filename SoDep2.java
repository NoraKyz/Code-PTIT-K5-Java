import java.util.*;

public class SoDep2 {

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
    if(n.charAt(0) != '8') {
      return "NO";
    }

    int s = 0;
    for (int i = 0; i < n.length(); i++) {
      s += n.charAt(i) - '0';
    }
    if (s % 10 != 0) {
      return "NO";
    }

    for (int i = 0; i < n.length() / 2; i++) {
      if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
        return "NO";
      }
    }

    return "YES";
  }
}