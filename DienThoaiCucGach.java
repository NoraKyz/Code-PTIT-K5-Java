import java.util.*;

public class DienThoaiCucGach {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    for (int i = 'a'; i <= 'c'; i++) map.put((char)i, 2);
    for (int i = 'd'; i <= 'f'; i++) map.put((char)i, 3);
    for (int i = 'g'; i <= 'i'; i++) map.put((char)i, 4);
    for (int i = 'j'; i <= 'l'; i++) map.put((char)i, 5);
    for (int i = 'm'; i <= 'o'; i++) map.put((char)i, 6);
    for (int i = 'p'; i <= 's'; i++) map.put((char)i, 7);
    for (int i = 't'; i <= 'v'; i++) map.put((char)i, 8);
    for (int i = 'w'; i <= 'z'; i++) map.put((char)i, 9);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
      String s = sc.nextLine().toLowerCase();
      ArrayList<Integer> res = new ArrayList<Integer>();
      for (Character c : s.toCharArray()) {
        if(c < 'a' || c > 'z') continue;
        
        res.add(map.get(c));      
      }

      System.out.println(solve(res));
    }

    sc.close();
  }

  public static String solve(ArrayList<Integer> res) {
    for(int i = 0; i < res.size() / 2; i++) {
      if (res.get(i) != res.get(res.size() - i - 1)) {
        return "NO";
      }
    }

    return "YES";
  }
}