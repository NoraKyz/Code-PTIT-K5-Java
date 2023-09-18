package obj;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    public String id;
    public String name;
    public Integer quanlity;

    public DoanhNghiep(String id, String name, Integer quanlity) {
        this.id = id;
        this.name = name;
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, quanlity);
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.quanlity.compareTo(o.quanlity) == 0) {
            return this.id.compareTo(o.id);
        } else {
            return o.quanlity.compareTo(this.quanlity);
        }
    }
}
