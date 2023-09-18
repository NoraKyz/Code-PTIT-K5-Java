import java.util.*;

public class HopCuaHaiDaySo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    Set<Integer> a = new TreeSet<>();

    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    for (int i = 0; i < m; i++) {
      a.add(sc.nextInt());
    }

    for (int i : a) {
        System.out.print(i + " ");
      
    }

    sc.close();
  }
}
