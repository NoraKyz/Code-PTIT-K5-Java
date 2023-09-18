import java.util.*;

public class SoKhongLienKe {

  public static void main(String[] args) {
    Long n, t;
    Scanner sc = new Scanner(System.in);

    t = sc.nextLong();
    for (int i = 1; i <= t; i++) {
      n = sc.nextLong();
      System.out.println(solve(n.toString()));
    }

    sc.close();
  }

  public static String solve(String s){
    for (int i = 0; i < s.length()-1; i++) {
      if (Math.abs(s.charAt(i) - s.charAt(i+1)) != 2) {
        return "NO";
      }
    }
    
    long res = 0;
    for (int i = 0; i < s.length(); i++){
      res += Math.abs(s.charAt(i) - '0');
    }

    if(res % 10 != 0){
      return "NO";
    }

    return "YES";
  }
}