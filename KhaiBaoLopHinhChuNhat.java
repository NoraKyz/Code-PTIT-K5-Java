import java.util.*;

class Rectange {
    private double width, height;
    private String color;

    Rectange() {
        this.height = this.width = 1;
    }

    Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }
}

public class KhaiBaoLopHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange A = new Rectange();
        double x = sc.nextDouble();
        A.setWidth(x);
        x = sc.nextDouble();
        A.setHeight(x);
        String s = sc.next();
        s = s.toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        A.setColor(s);
        if (A.getWidth() > 0 && A.getHeight() > 0)
            System.out.printf("%.0f %.0f %s", A.findPerimeter(), A.findArea(), A.getColor());
        else
            System.out.print("INVALID");
        sc.close();
    }

}