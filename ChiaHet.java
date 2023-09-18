import java.math.BigInteger;
import java.util.*;

public class ChiaHet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0) {
      BigInteger a = new BigInteger(sc.next());
      BigInteger b = new BigInteger(sc.next());

      if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }

    sc.close();
  }
}