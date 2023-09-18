import java.util.*;

public class TongUocSo1 {
  static Integer[] arr = new Integer[2000005];

  public static void main(String[] args) {
    Integer n, t;
    Long res = 0L;
    Scanner sc = new Scanner(System.in);
    sieve();
    t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      n = sc.nextInt();
      res += solve(n);
    }

    System.out.println(res);

    sc.close();
  }

  public static void sieve() {
    Arrays.fill(arr, 0);

    for (int i = 2; i <= 2000000; i++) {
      if (arr[i] == 0) {
        arr[i] = i;
        for (int j = i * 2; j <= 2000000; j += i) {
          arr[j] = i;
        }
      }
    }
  }

  public static Integer solve(Integer n) {
    Integer sum = 0;
    while (n > 1) {
      sum += arr[n];
      n /= arr[n];
    }

    return sum;
  }
}