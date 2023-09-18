import java.util.*;

public class BoSungDaySo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> a = new ArrayList<Integer>();

    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      a.add(sc.nextInt());
    }

    int x = Collections.max(a);
    int c = 0;
    for (int i = 1; i <= x; i++) {
      if (!a.contains(i)) {
        System.out.println(i);
        c = 1;
      }
    }

    if (c == 0) {
      System.out.println("Excellent!");
    }
    

    sc.close();
  }
}