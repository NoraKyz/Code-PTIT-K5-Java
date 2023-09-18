import java.util.*;

public class KhaiBaoLopNhanVien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] a = new String[6];
    for (int i = 0; i < 6; ++i)
        a[i] = sc.nextLine();
    System.out.printf("%s %s %s %s %s %s %s", "00001", a[0], a[1], a[2], a[3], a[4], a[5]);

    sc.close();
  }
}