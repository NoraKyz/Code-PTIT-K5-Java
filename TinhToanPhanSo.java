import java.util.*;
import java.io.*;
import java.math.BigInteger;

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

    public Fraction mul(Fraction other) {
        long numerator = this.numerator * other.numerator;
        long denominator = this.denominator * other.denominator;

        return new Fraction(numerator, denominator);
    }

    public void compact() {
        BigInteger a = BigInteger.valueOf(this.numerator);
        BigInteger b = BigInteger.valueOf(this.denominator);

        long gcd = a.gcd(b).longValue();

        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}

public class TinhToanPhanSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
      Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());

      f1.compact();
      f2.compact();

      Fraction f3 = f1.add(f2);
      f3.compact();

      Fraction f4 = f3.mul(f3);
      f4.compact();

      Fraction f5 = f1.mul(f2.mul(f4));
      f5.compact();

      System.out.println(f4.toString() + " " + f5.toString());
    }

    sc.close();
  }
}