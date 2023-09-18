import java.util.*;

public class TapTuRiengCuaHaiXau {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    
    while(t-- > 0) {
      Set<String> set = new TreeSet<String>();

      String s1 = sc.nextLine(), s2 = sc.nextLine();

      String[] a1 = s1.split(" ");
      String[] a2 = s2.split(" ");

      for (String s : a1) {
        if (!Arrays.asList(a2).contains(s)) {
          set.add(s);
        }
      }

      for (String s : set) {
        System.out.print(s + " ");
      }

      System.out.println();
    }

    sc.close();
  }
}