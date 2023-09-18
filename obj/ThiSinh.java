package obj;

class ThiSinh implements Comparable<ThiSinh> {
  public static int cnt = 1;
  public String id;
  public String name;
  public String birth;
  public float math;
  public float physics;
  public float chemistry;
  public static float point = 24;

  public ThiSinh(String name, String birth, float math, float physics, float chemistry) {
    this.id = String.format("%d", cnt++);
    this.name = name;
    this.birth = birth;
    this.math = math;
    this.physics = physics;
    this.chemistry = chemistry;
  };

  public float getTotalPoint() {
    return this.math + this.physics + this.chemistry;
  }

  public float getPriorityPoint() {
    String area = this.id.substring(0, 2);
    if(area.equals("KV1")) {
      return 0.5f;
    } else if(area.equals("KV2")) {
      return 1;
    } else {
      return 2.5f;
    }
  }

  public String getResult(){
    if(this.getTotalPoint() >= point) {
      return "TRUNG TUYEN";
    } else {
      return "TRUOT";
    }
  }

  @Override
  public String toString() {
    return this.id + " " + this.name + " " + this.birth + " " + this.getTotalPoint();
  }

  @Override
  public int compareTo(ThiSinh o) {
    return (int) (o.getTotalPoint() - this.getTotalPoint());
  } 
}