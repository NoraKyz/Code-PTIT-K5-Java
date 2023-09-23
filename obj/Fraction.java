package obj;

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
