import java.util.*;

public class TongGiaiThua {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Integer n;   

      {
        Long s = 0L;
          n = sc.nextInt();
          
          for(int i = 1; i <= n; i++)
          {
              s += giaiThua(i);
          }
          
          System.out.println(s);
      }  

      sc.close();
  }

  public static Long giaiThua(Integer n) {
    Long gt = 1L;
    for (int i = 1; i <= n; i++) {
      gt *= i;
    }
    return gt;
  }
}