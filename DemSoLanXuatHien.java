import java.util.*;

public class DemSoLanXuatHien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    for(int j = 0; j < t; j++) {
      int n = sc.nextInt();
      Map <Integer, Integer> m = new LinkedHashMap<>();

      for(int i = 1; i <= n; i++){
        int x = sc.nextInt();
        if(m.containsKey(x)) {
          m.put(x, m.get(x) + 1);
        } else {
          m.put(x, 1);
        }
      }

      System.out.println("Test " + (j+1) + ":");
      for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
        System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
      }
    }

    sc.close();
  }
}