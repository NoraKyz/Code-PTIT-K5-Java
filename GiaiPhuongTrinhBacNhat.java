import java.text.DecimalFormat;
import java.util.*;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
      Long a, b;
      Scanner sc = new Scanner(System.in);

      a = sc.nextLong();
      b = sc.nextLong();

      giaiPTB1(a, b);

      sc.close();
  }

  public static void giaiPTB1(Long a, Long b) {
    if (a == 0) {
      if (b == 0) {
        System.out.println("VSN");
      } else {
        System.out.println("VN");
      }
    } else {
      Double x = (double) -b / a;
      DecimalFormat df = new DecimalFormat("0.00");
      System.out.println(df.format(x));
    }
  }
}