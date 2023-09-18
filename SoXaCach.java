import java.util.*;

public class SoXaCach {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      solve(n);
    }

    sc.close();
  }

  public static void solve(int n) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    backtrack(n, a, 1);
  }

  public static void backtrack(int n, ArrayList<Integer> a, int i) {
    for (int j = 1; j <= n; j++) {

      if(a.contains(j)) continue;

      ArrayList<Integer> b = new ArrayList<Integer>(a);
      b.add(j);

      if (i == n) {
        if (check(b, n)) {
          for (int h = 0; h < n; h++) {
            System.out.print(b.get(h));
          }
          System.out.println();
        }
      } else {
        backtrack(n, b, i + 1);
      }
    }
  }

  public static Boolean check(ArrayList<Integer> a, int n) {
    for (int i = 0; i < n-1; i++) {
      if (Math.abs(a.get(i) - a.get(i+1)) == 1)
        return false;
    }

    return true;
  }
}