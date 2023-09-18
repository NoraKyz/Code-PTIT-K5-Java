import java.util.*;

public class XauDoiXung {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String s = sc.nextLine();
      System.out.println(solve(s));
    }

    sc.close();
  }

  public static String solve(String s){

    int cnt = 0;
    for (int i = 0; i < s.length() / 2; i++) {
      if(s.charAt(i) != s.charAt(s.length() - i - 1)) cnt++;
    }

    if(cnt == 1 || (cnt == 0 && s.length() % 2 == 1)) return "YES";

    return "NO";
  }
}