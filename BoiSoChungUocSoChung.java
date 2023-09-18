import java.math.BigInteger;
import java.util.*;

public class BoiSoChungUocSoChung {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Long t;   
      BigInteger a, b;

      t = sc.nextLong();
      while(t-- > 0)
      {
          a = sc.nextBigInteger();
          b = sc.nextBigInteger();

          System.out.println(a.multiply(b).divide(a.gcd(b)) + " " + a.gcd(b));
      }  

      sc.close();
  }
}