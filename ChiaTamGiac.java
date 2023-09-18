import java.text.DecimalFormat;
import java.util.*;

public class ChiaTamGiac {
    public static void main(String[] args) {
      Long n, h, t;
      Scanner sc = new Scanner(System.in);

      t = sc.nextLong();
      while(t-- > 0)
      {
          n = sc.nextLong();
          h = sc.nextLong();

          Progress(n, h);
      }  

      sc.close();
  }

  public static void Progress(Long n, Long h) {
    DecimalFormat df = new DecimalFormat("0.000000");

    for(int i = 1; i < n; i++)
    {
        System.out.print(df.format(h * Math.sqrt(i * 1.0 / n)) + " ");
    }

    System.out.println();
  }
}