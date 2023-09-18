package obj;

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
                LocalTime.parse(this.gioRa),
                LocalTime.parse(this.gioVao)).toMillis();
    }

    @Override
    public String toString() {
        String x = LocalTime.ofSecondOfDay(thoiGianSuDung).toString();
        return String.format("%s %s %s", id, name, x);
    }

    @Override
    public int compareTo(TaiKhoanNet o) {
        return (int) (this.thoiGianSuDung - o.thoiGianSuDung);
    }
}
