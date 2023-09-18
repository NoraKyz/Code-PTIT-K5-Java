import java.util.*;

public class SoUuThe {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String s = sc.nextLine();
      System.out.println(solve(s));
    }

    sc.close();
  }

  public static String solve(String s) {
    if(s.charAt(0) == '0') return "INVALID";

    int cnt = 0;
    for(Character c : s.toCharArray()){
      if(!Character.isDigit(c)) return "INVALID";

      if(c % 2 == 0) {
        cnt++;
      } else {
        cnt--;
      }
    }

    if(cnt > 0 && s.length() % 2 == 1) return "NO";
    if(cnt < 0 && s.length() % 2 == 0) return "NO";
    if(cnt == 0) return "NO";

    return "YES";
  }
}