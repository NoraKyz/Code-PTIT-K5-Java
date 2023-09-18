import java.util.*;
import java.io.*;

class ThiSinh {
  public String id;
  public String name;
  public float math;
  public float physics;
  public float chemistry;
  public static float point = 24;

  public ThiSinh(String id, String name, float math, float physics, float chemistry) {
    this.id = id;
    this.name = name;
    this.math = math;
    this.physics = physics;
    this.chemistry = chemistry;
  };

  public float getTotalPoint() {
    return this.math * 2 + this.physics + this.chemistry;
  }

  public float getPriorityPoint() {
    String area = this.id.substring(0, 3);
    if (area.equals("KV1")) {
      return 0.5f;
    } else if (area.equals("KV2")) {
      return 1;
    } else {
      return 2.5f;
    }
  }

  public String getResult() {
    if (this.getTotalPoint() + this.getPriorityPoint() >= point) {
      return "TRUNG TUYEN";
    } else {
      return "TRUOT";
    }
  }

  @Override
  public String toString() {
    String total = String.valueOf(this.getTotalPoint()).replace(".0", "");
    String priority = String.valueOf(this.getPriorityPoint()).replace(".0", "");
    return this.id + " " + this.name + " " + priority + " " + total + " " + this.getResult();
  }
}

public class BaiToanTuyenSinh {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ThiSinh ts1 = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
        Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
    System.out.println(ts1.toString());

    sc.close();
  }
}