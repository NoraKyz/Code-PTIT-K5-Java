import java.util.*;
import java.io.*;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    public String id;
    public String name;
    public Integer quanlity;

    public DoanhNghiep(String id, String name, Integer quanlity) {
        this.id = id;
        this.name = name;
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, quanlity);
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.quanlity.compareTo(o.quanlity) == 0) {
            return this.id.compareTo(o.id);
        } else {
            return o.quanlity.compareTo(this.quanlity);
        }
    }
}


public class DanhSachDoanhNghiepNhanSinhVienThucTap1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    

    sc.close();
  }
}