import java.util.*;

public class PhanTichThuaSoNguyenTo {
  public static void main(String[] args) {
    Integer n, t;
    Scanner sc = new Scanner(System.in);

    t = sc.nextInt();
    for(int i = 1; i <= t; i++) {
      n = sc.nextInt();
      System.out.print("Test " + i + ": ");
      progress(n);
      System.out.println();
    }

    sc.close();
  }

  public static void progress(Integer n) {

    LinkedHashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
    Integer i = 2;

    while (n >= i) {
      while (n % i == 0) {
        n /= i;
        if(m.containsKey(i)) {
          m.put(i, m.get(i) + 1);
        } else {
          m.put(i, 1);
        }
      }
      i++;
    }

    m.forEach((key, value) -> {
      System.out.print(key + "(" + value + ") ");
    });
  }
}