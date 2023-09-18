import java.util.*;
import java.time.Duration;
import java.time.LocalTime;

class TaiKhoanNet implements Comparable<TaiKhoanNet> {
  public String id;
  public String name;
  public String gioVao;
  public String gioRa;
  public long thoiGianSuDung;

  public TaiKhoanNet(String id, String name, String gioVao, String gioRa) {
    this.id = id;
    this.name = name;
    this.gioVao = gioVao;
    this.gioRa = gioRa;
    this.thoiGianSuDung = Duration.between(
        LocalTime.parse(this.gioVao),
        LocalTime.parse(this.gioRa)).toMillis();
  }

  @Override
  public String toString() {
    this.thoiGianSuDung /= 1000;
    Long hour = this.thoiGianSuDung / 3600;
    Long minutes = this.thoiGianSuDung / 60 % 60;
    return String.format("%s %s %s gio %s phut", this.id, this.name, hour.toString(), minutes.toString());
  }

  @Override
  public int compareTo(TaiKhoanNet o) {
    return (int) (-this.thoiGianSuDung + o.thoiGianSuDung);
  }
}

public class TinhGio {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TaiKhoanNet[] arr = new TaiKhoanNet[100];
    int t = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < t; i++) {
      String id = sc.nextLine();
      String name = sc.nextLine();
      String gioVao = sc.nextLine();
      String gioRa = sc.nextLine();
      arr[i] = new TaiKhoanNet(id, name, gioVao, gioRa);
    }

    Arrays.sort(arr, 0, t);

    for (int i = 0; i < t; i++) {
      System.out.println(arr[i]);
    }

    sc.close();
  }
}