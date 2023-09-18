import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
  private String id, name, className, birth;
  private float gpa;

  public SinhVien(String name, String className, String birth, float gpa) {
    this.id = "B20DCCN001";
    this.name = name;
    this.className = className;
    this.birth = birth;
    this.gpa = gpa;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = sdf.parse(this.birth);
      this.birth = sdf.format(date);
    } catch (ParseException e) {
      System.out.println("Lỗi xử lý chuỗi ngày: " + e.getMessage());
    }

  }

  public void display() {
    System.out.printf("%s %s %s %s %.2f", this.id, this.name, this.className, this.birth, this.gpa);
  }
}

public class KhaiBaoLopSinhVien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
    sv.display();
    sc.close();
  }
}