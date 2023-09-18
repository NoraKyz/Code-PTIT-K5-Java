import java.util.*;

public class DaoTu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String s = sc.nextLine();
      solve(s);
      System.out.println();
    }

    sc.close();
  }

  public static void solve(String s) {
    String[] a = s.split("\\s+");

    for (String i : a) {
      StringBuilder sb = new StringBuilder(i);
      System.out.print(sb.reverse() + " ");
    }
  }
}