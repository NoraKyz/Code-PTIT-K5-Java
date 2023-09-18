import java.util.*;

public class XuLyVanBan {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = "";
    while(sc.hasNextLine()){
      s += sc.nextLine().trim().toLowerCase();
    }

    String[] a = s.split("[A-Z]*[.!?]");

    for (String str : a) {
      Boolean flag = true;
      for ( String i : str.trim().split("\\s+")) {
        if(flag) {
          System.out.print(i.substring(0, 1).toUpperCase() + i.substring(1) + " ");
          flag = false;
          continue;
        }

        System.out.print(i + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}