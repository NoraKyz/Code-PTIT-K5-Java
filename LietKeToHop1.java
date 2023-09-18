import java.util.*;

public class LietKeToHop1 {

  public static int cnt = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //int t = sc.nextInt();
    //for (int i = 1; i <= t; i++) {
      int n = sc.nextInt(), k = sc.nextInt();
      solve(n, k);
    //}

    sc.close();
  }

  public static void solve(int n, int k) {
    int[] a = new int[k+1];
    backtrack(n, k, a, 1, 1);
    System.out.print("Tong cong co " + cnt + " to hop");
  }

  public static void backtrack(int n, int k, int[] a, int st, int i) {
    for (int j = st; j <= n; j++) {

      int[] b = a.clone();
      b[i] = j;

      if (i == k) {
        cnt++;
        for (int h = 1; h <= k; h++) {
          System.out.print(b[h] + " ");
        }
        System.out.println();
      } else {
        backtrack(n, k, b, j+1, i+1);
      }
    }
  }
}