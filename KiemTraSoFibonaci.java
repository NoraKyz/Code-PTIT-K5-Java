import java.util.*;

public class KiemTraSoFibonaci {
    public static void main(String[] args) {
        Long[] a = new Long[95];
        Long t, n;
        Scanner sc = new Scanner(System.in);

        a[0] = 0L;
        a[1] = 1L;

        for (int i = 2; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        t = sc.nextLong();
        while (t-- > 0) {
            n = sc.nextLong();
            int idx = Arrays.binarySearch(a, 0, 92, n);
            if (idx < 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

        sc.close();
    }
}