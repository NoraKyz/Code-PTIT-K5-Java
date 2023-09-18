import java.util.*;

public class TimTuThuanNghichDaiNhat {

  public static Boolean check(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
    int max = 0;
    while(sc.hasNextLine()) {
      String[] a = sc.nextLine().split(" ");
      for (String s : a) {
        if(check(s)) {
          max = Math.max(max, s.length());
          if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
          } else {
            map.put(s, 1);
          }
        }
      }
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getKey().length() == max) {
        System.out.println(entry.getKey() + " " + entry.getValue());
      }
    }

    sc.close();
  }
}