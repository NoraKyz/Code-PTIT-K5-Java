import java.util.*;

public class BoBaSoPytago {
    static long t, n;
    static long[] a = new long[100001];

    static String Solve(long[] a) {
        for (int i = 1; i <= n - 1; i++) {
            long l = i + 1, r = n, s = a[(int) l] * a[(int) l] + a[(int) i] * a[(int) i];
            while (l < r) {
                while (l < r && a[(int) r] * a[(int) r] > s)
                    r--;
                if (a[(int) r] * a[(int) r] == s)
                    return "YES";
                l++;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextLong();
        while (t-- > 0) {
            n = sc.nextLong();
            for (int i = 1; i <= n; i++)
                a[i] = sc.nextLong();
            Arrays.sort(a, 1, (int) (n + 1));
            System.out.println(Solve(a));
        }
        sc.close();
    }
}
