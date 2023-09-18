import java.util.*;

public class SoNguyenTo {
    public static void main(String[] args) {
      Long n, t;
      Scanner sc = new Scanner(System.in);

      t = sc.nextLong();
      while(t-- > 0)
      {
          n = sc.nextLong();
          System.out.println(isPrime(n));
      }  

      sc.close();
  }

  public static String isPrime(long n)
  {
      if(n < 2) return "NO";
      for(int i = 2; i <= Math.sqrt(n); i++)
      {
          if(n % i == 0) return "NO";
      }
      return "YES";
  }
}