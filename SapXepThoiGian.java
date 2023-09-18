import java.util.*;

class Time implements Comparable<Time> {
  private int h, m, s;

  public Time(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
  }

  @Override
  public String toString() {
    return h + " " + m + " " + s;
  }

  @Override
  public int compareTo(Time o) {
    if (this.h != o.h)
      return this.h - o.h;
    if (this.m != o.m)
      return this.m - o.m;
    return this.s - o.s;
  }
}

public class SapXepThoiGian {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    ArrayList<Time> a = new ArrayList<>();
    while (t-- > 0)
      a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    Collections.sort(a);
    for (Time i : a)
      System.out.println(i);

    sc.close();
  }
}