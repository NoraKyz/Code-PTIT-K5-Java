package obj;

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
