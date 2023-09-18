import java.util.*;
import java.io.*;

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

    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
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

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Triangle {
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }

    public String getPerimeter() {
        return String.format("%.3f", AB + AC + BC);
    }

    public double getSurface() {
        double p = (this.AB + this.AC + this.BC) / 2;
        return Math.sqrt(p * (p - this.AB) * (p - this.AC) * (p - this.BC));
    }

    public double getCircleSurface() {
        double p = (this.AB + this.AC + this.BC) / 2;
        return (this.AB * this.AC * this.BC) / (4 * Math.sqrt(p * (p - this.AB) * (p - this.AC) * (p - this.BC)));
    }

    @Override
    public String toString() {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB + AC + BC);
    }

    public Boolean valid() {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return false;
        return true;
    }
}

public class LopTriangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}