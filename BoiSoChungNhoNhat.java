import java.math.BigInteger;
import java.util.*;

public class BoiSoChungNhoNhat {

  public static void main(String[] args) {
    long t;
    BigInteger a, b;
    Scanner sc = new Scanner(System.in);

    t = sc.nextLong();
    for (int i = 1; i <= t; i++) {
      a = sc.nextBigInteger();
      b = sc.nextBigInteger();

      System.out.println(a.multiply(b).divide(a.gcd(b)));
    }

    sc.close();
  }
}