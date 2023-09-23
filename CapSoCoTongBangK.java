import java.util.*;

public class CapSoCoTongBangK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = Long.parseLong(sc.nextLine());
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            Long[] a = new Long[(int) n];

            LinkedHashMap<Long, Long> map = new LinkedHashMap<Long, Long>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1L);
                }
            }

            long res = 0;

            for (long it : a) {
                if(it * 2 != k) {
                    res += map.getOrDefault(k - it, 0L) * map.getOrDefault(it, 0L);                   
                } else {
                    res += map.get(it) * (map.get(it) - 1) / 2;
                }
                map.put(it, 0L);
            }

            System.out.println(res);
        }

        sc.close();
    }
}