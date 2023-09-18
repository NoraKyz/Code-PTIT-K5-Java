import java.math.BigInteger;
import java.util.*;

class Fraction {
  private long numerator;
  private long denominator;

  public Fraction(long numerator, long denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public void compact() {
    BigInteger a = BigInteger.valueOf(this.numerator);
    BigInteger b = BigInteger.valueOf(this.denominator);

    BigInteger gcd = a.gcd(b);

    if(gcd.intValue() == 0) {
      return;
    }

    this.numerator /= gcd.longValue();
    this.denominator /= gcd.longValue();
    System.out.println(this.numerator + "/" + this.denominator);
  }
}

public class PhanSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    Fraction f = new Fraction(a, b);
    f.compact();

    sc.close();
  }
}