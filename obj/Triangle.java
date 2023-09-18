package obj;

import obj.Point;

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
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }

    public Triangle(Point A, Point B, Point C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }

    public double getPerimeter()
    {
        return AB + AC + BC;
    }

    public double getSurface () {
        double p = (this.AB + this.AC + this.BC) / 2;
        return Math.sqrt(p * (p - this.AB) * (p - this.AC) * (p - this.BC));
    }

    public double getCircleSurface() {
        double p = (this.AB + this.AC + this.BC) / 2;
        return (this.AB * this.AC * this.BC) / (4 * Math.sqrt(p * (p - this.AB) * (p - this.AC) * (p - this.BC)));
    }

    @Override
    public String toString()
    {
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