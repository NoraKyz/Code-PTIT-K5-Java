import java.util.*;

public class TinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
      Long n, t;
      Scanner sc = new Scanner(System.in);

      t = sc.nextLong();
      while(t-- > 0)
      {
          n = sc.nextLong();
          System.out.println(n * (n + 1) / 2);
      }  

      sc.close();
  }
}