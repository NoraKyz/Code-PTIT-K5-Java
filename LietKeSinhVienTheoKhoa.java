import java.util.*;
import java.io.*;
class SinhVien implements Comparable<SinhVien> {
    public String id;
    public String name;
    public String lop;
    public String email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.name, this.lop, this.email);
    }

    @Override
    public int compareTo(SinhVien other) {
        return this.id.compareTo(other.id);
    }
}

public class LietKeSinhVienTheoKhoa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    SinhVien[] sinhViens = new SinhVien[10000];
    
    Integer n = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < n; i++) {
        String id = sc.nextLine();
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String email = sc.nextLine();
        sinhViens[i] = new SinhVien(id, name, lop, email);
    }
    
    Integer q = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < q; i++) {
        String lop = sc.nextLine();
        System.out.println("DANH SACH SINH VIEN KHOA " + lop + ":");
        lop = lop.substring(2, 4);
        
        for(int j = 0; j < n; j++) {
            if(sinhViens[j].lop.substring(1, 3).equals(lop)) {
                System.out.println(sinhViens[j]);
            }
        }
    }

    sc.close();
  }
}