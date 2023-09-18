import java.util.*;

public class TichMaTranVoiChuyenViCuaNo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int s = 1; s <= t; s++) {
      System.out.println("Test " + s + ":");

      int n = sc.nextInt(), m = sc.nextInt();

      int[][] a = new int[n][m];
      int[][] b = new int[m][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          a[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          b[i][j] = a[j][i];
        }
      }

      int[][] c = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          for (int k = 0; k < m; k++) {
            c[i][j] += a[i][k] * b[k][j];
          }

          System.out.print(c[i][j] + " ");
        }
        System.out.println();
      }
    }

    sc.close();
  }
}