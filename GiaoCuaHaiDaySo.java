import java.util.*;

public class GiaoCuaHaiDaySo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    Set<Integer> a = new TreeSet<>();
    Set<Integer> b = new TreeSet<>();

    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    for (int i = 0; i < m; i++) {
      b.add(sc.nextInt());
    }

    for (int i : b) {
      if (a.contains(i)) {
        System.out.print(i + " ");
      }
    }

    sc.close();
  }
}
