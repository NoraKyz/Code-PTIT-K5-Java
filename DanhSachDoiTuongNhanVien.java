import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class NhanVien implements Comparable<NhanVien>  {
    public static int cnt = 1;
    public String ID;
    public String name;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;
    public String tax;
    public String ngayKiHopDong;
    public String ngaySinhFormat;

    public NhanVien(String name, String gioiTinh, String ngaySinh, String diaChi, String tax, String ngayKiHopDong) {
        ID = String.format("%05d", cnt++);
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tax = tax;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + tax + " " + ngayKiHopDong;
    }

    @Override
    public int compareTo(NhanVien o) {  
        String a = ngaySinh.substring(6, 10) + ngaySinh.substring(3, 5) + ngaySinh.substring(0, 2);
        String b = o.ngaySinh.substring(6, 10) + o.ngaySinh.substring(3, 5) + o.ngaySinh.substring(0, 2);
        return a.compareTo(b);
    }
}


public class DanhSachDoiTuongNhanVien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    NhanVien[] nhanViens = new NhanVien[100];

    int t = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < t; i++) {
      String name = sc.nextLine();
      String gioiTinh = sc.nextLine();
      String ngaySinh = sc.nextLine();
      String diaChi = sc.nextLine();
      String tax = sc.nextLine();
      String ngayKiHopDong = sc.nextLine();

      nhanViens[i] = new NhanVien(name, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong);

    }

    for(int i = 0; i < t; i++) {
      System.out.println(nhanViens[i].toString());
    }

    sc.close();
  }
}