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

public class SapXepTheoMaSinhVien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    SinhVien[] sinhViens = new SinhVien[10000];
    int cnt = 0;

    while(sc.hasNextLine()) {
        String id = sc.nextLine();
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String email = sc.nextLine();
        sinhViens[cnt++] = new SinhVien(id, name, lop, email);
    }

    Arrays.sort(sinhViens, 0, cnt);
    
    for(int i = 0; i < cnt; i++) {
        System.out.println(sinhViens[i].toString());
    }

    sc.close();
  }
}