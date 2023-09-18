import java.util.*;

public class SoLaMa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    map.put('I', 1);
    map.put('V', 5);  
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {  
      String s = sc.nextLine();
      int res = map.get(s.charAt(s.length() - 1));
      for(int i = s.length() - 2; i >= 0; i--) {
        if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
          res -= map.get(s.charAt(i));
        } else {
          res += map.get(s.charAt(i));
        }
      }

      System.out.println(res);
    }

    sc.close();
  }
}