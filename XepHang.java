import java.util.*;

class Khach implements Comparable<Khach> {
  int t, d;

  public Khach(int t, int d) {
    this.t = t;
    this.d = d;
  }

  @Override
  public int compareTo(Khach o) {
    return this.t - o.t;
  }
}

public class XepHang {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Khach[] khach = new Khach[1000];

    int n = Integer.parseInt(sc.nextLine());
    for (int t = 0; t < n; t++) {
      khach[t] = new Khach(sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(khach, 0, n);
    int res = 0;

    for (int i = 0; i < n; i++) {
      res = Math.max(res, khach[i].t);
      res += khach[i].d;
    }

    System.out.println(res);

    sc.close();
  }
}