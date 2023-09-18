import java.util.*;
import java.io.*;

class ComplexNumber {
    public Integer real;
    public Integer imaginary;

    public ComplexNumber(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        Integer real = this.real + other.real;
        Integer imaginary = this.imaginary + other.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber mul(ComplexNumber other) {
        Integer real = this.real * other.real - this.imaginary * other.imaginary;
        Integer imaginary = this.real * other.imaginary + this.imaginary * other.real;

        return new ComplexNumber(real, imaginary);
    }

    public String toString() {
        return String.format("%d + %di", this.real, this.imaginary);
    }
}

public class SoPhuc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      ComplexNumber A = new ComplexNumber(sc.nextInt(), sc.nextInt());
      ComplexNumber B = new ComplexNumber(sc.nextInt(), sc.nextInt());

      ComplexNumber X = A.add(B);

      ComplexNumber C = A.mul(X);
      ComplexNumber D = X.mul(X);

      System.out.println(C.toString() + ", " + D.toString());
    }

    sc.close();
  }
}