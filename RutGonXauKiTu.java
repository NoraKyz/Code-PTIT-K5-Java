import java.util.*;

public class RutGonXauKiTu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    while (true) {
      String a = s.replaceAll("(.)\\1", "");
      if (a.equals(s))
        break;
      s = s.replaceAll("(.)\\1", "");
    }

    if(s.length() == 0)
      System.out.println("Empty String");
    else
      System.out.println(s);

    sc.close();
  }
}