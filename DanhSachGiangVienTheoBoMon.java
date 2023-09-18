import java.util.*;
import java.io.*;

class GiangVien implements Comparable<GiangVien> {
    public static int cnt = 1;
    public String id;
    public String name;
    public String mon = "";

    public GiangVien(String name, String mon) {
        this.id = String.format("GV%02d", cnt++);
        this.name = name;
        String[] str = mon.split(" ");
        for(String s : str) {
            this.mon += s.substring(0, 1).toUpperCase();
        }
    }

    public String toString() {
        return String.format("%s %s %s", id, name, mon);
    }

    @Override
    public int compareTo(GiangVien o) {
        String s1 = this.name.split(" ")[this.name.split(" ").length - 1];
        String s2 = o.name.split(" ")[o.name.split(" ").length - 1];

        if(s1.compareTo(s2) == 0) {
            return this.id.compareTo(o.id);
        } else {
            return s1.compareTo(s2);
        }
    }   
}

public class DanhSachGiangVienTheoBoMon {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GiangVien[] gv = new GiangVien[100];
    int t = Integer.parseInt(sc.nextLine());
    
    for(int i = 0; i < t; i++) {
        String name = sc.nextLine();
        String mon = sc.nextLine();
        gv[i] = new GiangVien(name, mon);
    }

    int q = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < q; i++) {
        String mon = sc.nextLine();
        String[] str = mon.split(" ");
        mon = "";
        for(String s : str) {
            mon += s.substring(0, 1).toUpperCase();
        }
        System.out.println("DANH SACH GIANG VIEN BO MON " + mon + ":");
        for(int j = 0; j < t; j++) {
            if(gv[j].mon.equals(mon.toUpperCase())) {
                System.out.println(gv[j]);
            }
        }
    }

    sc.close();
  }
}