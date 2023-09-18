import java.util.*;

class Point {
  private double x;
  private double y;

  public Point() {

  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double distance(Point p) {
    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
  }

  public double distance(Point a, Point b) {
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}

public class KhaiBaoLopPoint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();

      Point p1 = new Point(a, b);
      Point p2 = new Point(c, d);

      System.out.println(String.format("%.4f", p1.distance(p2)));
    }

    sc.close();
  }
}