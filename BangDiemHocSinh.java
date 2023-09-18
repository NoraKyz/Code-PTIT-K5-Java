import java.util.*;

class BangDiem implements Comparable<BangDiem> {
    public static int count = 1;
    public String id;
    public String name;
    public float[] diem = new float[10];
    public float diemTB;
    public String xepLoai;

    public BangDiem(String name, float[] diem) {
        this.id = String.format("HS%02d", count++);
        this.name = name;
        this.diem = diem;
        this.diemTB = 0;
        this.diemTB += (this.diem[0] + this.diem[1]) * 2;
        for (int i = 2; i < 10; i++) {
            this.diemTB += this.diem[i];
        }
        this.diemTB /= 12;
        this.diemTB = Math.round(this.diemTB * 10) / 10.0f;
    }

    public String getType(){
        if(this.diemTB >= 9) {
            return "XUAT SAC";
        } else if(this.diemTB >=8 ) {
            return "GIOI";
        } else if(this.diemTB >=7 ) {
            return "KHA";
        } else if(this.diemTB >=5 ) {
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", this.id, this.name, this.diemTB, this.getType());
    }

    @Override
    public int compareTo(BangDiem other) {
        if(this.diemTB > other.diemTB) {
            return -1;
        } else if(this.diemTB < other.diemTB) {
            return 1;
        } else {
            return this.id.compareTo(other.id);
        }
    }
}

public class BangDiemHocSinh {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BangDiem[] bangDiems = new BangDiem[100];

    int t = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < t; i++) {
      String name = sc.nextLine();
      String diemStr = sc.nextLine();

      String[] diemArr = diemStr.split("\\s+");
      float[] diem = new float[10];
      for (int j = 0; j < 10; j++) {
        diem[j] = Float.parseFloat(diemArr[j]);
      }
      
      bangDiems[i] = new BangDiem(name, diem);
    }

    Arrays.sort(bangDiems, 0, t);
    for(int i = 0; i < t; i++) {
        System.out.println(bangDiems[i].toString());
    }

    sc.close();
  }
}