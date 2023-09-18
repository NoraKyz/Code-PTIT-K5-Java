import java.util.*;

public class InMaTran {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      int[][] a = new int[n][n];

      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          a[j][k] = sc.nextInt();
        }
      }

      for (int j = 0; j < n; j++) {
        if (j % 2 == 0) {
          for (int k = 0; k < n; k++) {
            System.out.print(a[j][k] + " ");
          }
        } else {
          for (int k = n - 1; k >= 0; k--) {
            System.out.print(a[j][k] + " ");
          }
        }
      }

      System.out.println();
    }

    sc.close();
  }
}