import java.util.*;

class ThiSinh {
  private String name, birth;
  private float a, b, c, total;

  public ThiSinh(String name, String birth, float a, float b, float c) {
    this.name = name;
    this.birth = birth;
    this.a = a;
    this.b = b;
    this.c = c;
    this.total = a + b + c;
  }

  public void display() {
    System.out.printf("%s %s %.1f", this.name, this.birth, this.total);
  }
}

public class KhaiBaoLopThiSinh {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
    ts.display();

    sc.close();
  }
}