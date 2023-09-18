import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SoKhacNhauTrongFile1 {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("DATA.in"));
    //Scanner sc = new Scanner(System.in);

    String line;
    HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    Set<Integer> set = new TreeSet<Integer>();

    while(sc.hasNextLine()) {
      line = sc.nextLine();
      String[] arr = line.split(" ");
      
      for (String s : arr) {
        Integer i = Integer.parseInt(s);
        set.add(i);
        if (map.containsKey(i)) {
          map.put(i, map.get(i) + 1);
        } else {
          map.put(i, 1);
        }
      }
    }

    for (Integer key : set) {
      System.out.println(key + " " + map.get(key));
    }

    sc.close();
  }
}