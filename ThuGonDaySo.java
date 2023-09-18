import java.util.*;

public class ThuGonDaySo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayDeque<Integer> arr = new ArrayDeque<Integer>();

    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();

      if(arr.size() == 0) {
        arr.addFirst(n);
      } else {
        if((arr.getFirst() + n) % 2 == 0) {
          arr.pollFirst();
        } else {
          arr.addFirst(n);
        }
      }
    }

    System.out.println(arr.size());

    sc.close();
  }
}