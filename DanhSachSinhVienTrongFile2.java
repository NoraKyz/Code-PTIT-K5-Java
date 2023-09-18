import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
  private String ID;
  private String name;
  private String studentClass;
  private String birthday;
  private float GPA;
  private static int cnt = 1;

  public SinhVien(String name, String studentClass, String birthday, float GPA) throws ParseException {
    ID = String.format("B20DCCN%03d", cnt++);
    this.name = name;
    DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    this.studentClass = studentClass;
    this.birthday = date.format(date.parse(birthday));
    this.GPA = GPA;
  }

  @Override
  public String toString() {
    return ID + " " + name + " " + studentClass + " " + birthday + " " + String.format("%.2f", GPA);
  }
}

public class DanhSachSinhVienTrongFile2 {

  public static void main(String[] args) throws ParseException, FileNotFoundException {
    Scanner sc = new Scanner(new File("SV.in"));
    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0)
      System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
  }
}