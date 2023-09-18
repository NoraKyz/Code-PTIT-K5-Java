import java.util.*;

public class HinhChuNhat {
    public static void main(String[] args) {
      Long a, b;
      Scanner sc = new Scanner(System.in);
      a = sc.nextLong();
      b = sc.nextLong();
      Caculator(a, b);

      sc.close();
  }

  public static void Caculator(Long a, Long b) {
    if(a <= 0 || b <= 0) {
      System.out.println(0);
      return;
    }

    Long C = (a + b) * 2;
    Long S = a * b;

    System.out.println(C + " " + S);
  }
}