import java.util.*;
import java.io.*;

public class ChuanHoaXauHoTenTrongFile {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("DATA.in"));
    String s;
    while (true) {
      s = sc.nextLine().toLowerCase().trim();
      String[] a = s.split("\\s+");
      if (a[0].compareTo("end") == 0)
        break;
      for (String i : a)
        System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
      System.out.println();
    }
  }
}