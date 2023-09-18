import java.util.*;

public class ChuSo4VaChuSo7 {

  public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);

    s = sc.nextLine();

    Long res = 0L;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '4' || s.charAt(i) == '7') {
        res++;
      }
    }

    if(res == 4 || res == 7){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }

}