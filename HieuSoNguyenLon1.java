import java.math.BigInteger;
import java.util.*;

public class HieuSoNguyenLon1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();
      BigInteger s = a.subtract(b).abs();

      int max = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
      String res = s.toString();

      while (res.length() < max)
        res = "0" + res;
      System.out.println(res);
    }

    sc.close();
  }
}