package obj;

class BangDiem {
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
        for (int i = 0; i < 10; i++) {
            this.diemTB += this.diem[i];
        }
        this.diemTB /= 10;
    }

    public String getType(){
        if(this.diemTB >= 9) {
            return "XUAT SAC";
        } else if(this.diemTB >=8 && this.diemTB < 9) {
            return "GIOI";
        } else if(this.diemTB >=7 && this.diemTB < 8) {
            return "KHA";
        } else if(this.diemTB >=5 && this.diemTB < 7) {
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", this.id, this.name, this.diemTB, this.getType());
    }
}
