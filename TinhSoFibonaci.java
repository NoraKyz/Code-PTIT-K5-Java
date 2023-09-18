import java.util.*;

public class TinhSoFibonaci {
    public static void main(String[] args) {
      Long[] a = new Long[100];    
      Long t;
      Integer n;
      Scanner sc = new Scanner(System.in);
        
      a[1] = 1L;
      a[2] = 1L;

      for(int i = 3; i <= 92; i++)
      {
          a[i] = a[i-1] + a[i-2];
      }

      t = sc.nextLong();
      while(t-- > 0)
      {
          n = sc.nextInt();
          System.out.println(a[n]);
      }  

      sc.close();
  }
}