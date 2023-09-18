import java.util.*;

public class DiaChiEmail {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<String, Integer> map = new HashMap<>();

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String s = sc.nextLine().trim().toLowerCase();
      ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

      String res = "";

      res += list.get(list.size() - 1);

      for (int i = 0; i < list.size() - 1; i++) {
        String tmp = list.get(i);
        if (tmp.length() > 0) {
          res += tmp.charAt(0);
        }
      }

      if(map.containsKey(res)) {
        map.put(res, map.get(res) + 1);
        res += map.get(res);
      } else {
        map.put(res, 1);
      }

      res += "@ptit.edu.vn";
      System.out.println(res);
    }

    sc.close();
  }
}