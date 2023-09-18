package obj;

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
