import java.util.*;
import java.io.*;

class Production implements Comparable<Production> {
    public String maMH;
    public String tenMH;
    public String donViTinh;
    public float giaMua;
    public float giaBan;
    public float loiNhuan;
    public static int cnt = 1;

    public Production(String tenMH, String donViTinh, float giaMua, float giaBan) {
        this.maMH = String.format("%d", cnt++);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + donViTinh + " " + String.format("%.2f", loiNhuan);
    }

    @Override
    public int compareTo(Production o) {
        return (int) (o.loiNhuan - this.loiNhuan);
    }
}

public class SapXepDanhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Production[] productions = new Production[100];
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String tenMH = sc.nextLine();
            String donViTinh = sc.nextLine();
            float giaMua = Float.parseFloat(sc.nextLine());
            float giaBan = Float.parseFloat(sc.nextLine());
            productions[i] = new Production(tenMH, donViTinh, giaMua, giaBan);
        }

        Arrays.sort(productions, 0, t);

        for (int i = 0; i < t; i++) {
            System.out.println(productions[i]);
        }

        sc.close();
    }
}