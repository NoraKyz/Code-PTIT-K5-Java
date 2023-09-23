import java.util.*;

public class SoThuc {
    float a, b, c;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        System.out.print("Nhap c: ");
        c = sc.nextFloat();
    }

    // Checked
    public void timNghiemPhuongTrinh() {
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat: " + (-c/b));
            }
        } else {
            float delta = b*b - 4*a*c;
            if(delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + ((-b + Math.sqrt(delta))/(2*a)) + " va " + ((-b - Math.sqrt(delta))/(2*a)));
            }
        }
    }

    public void dienTichTamGiac() {
        float p = (a + b + c) / 2;
        System.out.println("Dien tich tam giac: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    public void chuViVaDienTichHinhHop() {
        float chuVi = 4*(a + b + c);
        float dienTich = 2*(a*b + b*c + c*a);

        System.out.println("Chu vi hinh hop: " + chuVi);
        System.out.println("Dien tich hinh hop: " + dienTich);
    }
}
