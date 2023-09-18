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
        if(this.lop.compareTo(other.lop) == 0) {
            return this.id.compareTo(other.id);
        } else {
            return this.lop.compareTo(other.lop);
        }
    }
}

public class SapXepSinhVienTheoLop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    
    SinhVien[] sinhViens = new SinhVien[10000];

    for(int i = 0; i < t; i++) {
        String id = sc.nextLine();
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String email = sc.nextLine();
        sinhViens[i] = new SinhVien(id, name, lop, email);
    }

    Arrays.sort(sinhViens, 0, t);
    
    for(int i = 0; i < t; i++) {
        System.out.println(sinhViens[i].toString());
    }

    sc.close();
  }
}