import java.util.*;

public class SoChinhPhuong {

  public static void main(String[] args) {
    long n, t;
    Scanner sc = new Scanner(System.in);

    t = sc.nextLong();
    for (int i = 1; i <= t; i++) {
      n = sc.nextLong();

      if (Math.sqrt(n) == (int) Math.sqrt(n)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    sc.close();
  }
}