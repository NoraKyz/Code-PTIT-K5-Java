import java.util.*;

class Point
{
    private double x, y;

    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getDist(Point A)
    {
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
}

class Triangle
{
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.getDist(B);
        this.AC = A.getDist(C);
        this.BC = B.getDist(C);
    }

    @Override
    public String toString()
    {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB + AC + BC);
    }
}

public class ChuViTamGiac {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Triangle A = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
          sc.nextDouble());
      System.out.println(A);
    }

    sc.close();
  }
}