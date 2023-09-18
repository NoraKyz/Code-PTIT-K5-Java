import java.util.*;

public class XauNhiPhan {

  public static void main(String[] args) {
    long n, k, t;
    Scanner sc = new Scanner(System.in);

    long f[] = new long[100];
    f[1] = 1;
    f[2] = 1;
    for(int i = 3; i <= 92; i++) {
      f[i] = f[i-1] + f[i-2];
    }

    t = sc.nextLong();
    while(t-- > 0) {
      n = sc.nextLong();
      k = sc.nextLong();

      System.out.println(solve(f,n,k));
    }

    sc.close();
  }

  public static long solve(long[] f, long n, long k){
    int l = (int) n;
    if(l == 1) return 0;
    if(l == 2) return 1;
    
    if(k <= f[l-2]) return solve(f,l-2,k);
    else return solve(f,l-1,k-f[l-2]);
  }
}