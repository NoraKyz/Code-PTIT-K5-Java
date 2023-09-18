import java.math.BigInteger;
import java.util.*;

class Fraction {
  private long numerator;
  private long denominator;

  public Fraction(long numerator, long denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction add(Fraction other) {
    long numerator = this.numerator * other.denominator + other.numerator * this.denominator;
    long denominator = this.denominator * other.denominator;

    return new Fraction(numerator, denominator);
  }

  public void compact() {
    BigInteger a = BigInteger.valueOf(this.numerator);
    BigInteger b = BigInteger.valueOf(this.denominator);

    long gcd = a.gcd(b).longValue();

    this.numerator /= gcd;
    this.denominator /= gcd;
    System.out.println(this.numerator + "/" + this.denominator);
  }
}
public class TongPhanSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
    Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());

    Fraction f3 = f1.add(f2);
    f3.compact();

    sc.close();
  }
}