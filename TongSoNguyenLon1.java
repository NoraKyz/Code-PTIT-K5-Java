import java.math.BigInteger;
import java.util.*;

public class TongSoNguyenLon1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();
      System.out.println(a.add(b));

    }

    sc.close();
  }
}