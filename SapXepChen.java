import java.util.*;

public class SapXepChen {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> set = new ArrayList<Integer>();

    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      set.add(n);
      set.sort(null);
      System.out.print("Buoc " + i + ": ");
      for (int num : set) {
        System.out.print(num + " ");
      }
      System.out.println();
    }

    

    sc.close();
  }
}