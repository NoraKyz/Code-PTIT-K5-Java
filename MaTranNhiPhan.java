import java.util.*;

public class MaTranNhiPhan {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int res = 0;

    for (int i = 1; i <= t; i++) {
      int cnt = 0;
      for (int j = 1; j <= 3; j++) {
        cnt += sc.nextInt();
      }
      if(cnt >= 2) res++;
    }

    System.out.println(res);

    sc.close();
  }
}