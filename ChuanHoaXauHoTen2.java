import java.util.*;

public class ChuanHoaXauHoTen2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0) {
      String s = sc.nextLine().trim().toLowerCase();

      String[] a = s.split("\\s+");
      
      for (int i = 1; i < a.length; i++) {
        System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1));
        if (i < a.length - 1) {
          System.out.print(" ");
        }
      }

      System.out.print(", " + a[0].toUpperCase());
      System.out.println();
    }

    sc.close();
  }
}