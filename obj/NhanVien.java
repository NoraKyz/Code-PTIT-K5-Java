package obj;

class NhanVien implements Comparable<NhanVien> {
    public static int cnt = 1;
    public String ID;
    public String name;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;
    public String tax;
    public String ngayKiHopDong;

    public NhanVien(String name, String gioiTinh, String ngaySinh, String diaChi, String tax, String ngayKiHopDong) {
        ID = String.format("NV%05d", cnt++);
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
        return ngaySinh.compareTo(o.ngaySinh);
    }
}
