import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


class Student {
    private String ID;
    private String name;
    private String studentClass;
    private String birthday;
    private float GPA;
    private static int cnt = 1;

    public Student(String name, String studentClass, String birthday, float GPA) throws ParseException {
        ID = String.format("B20DCCN%03d", cnt++);
        this.name = name;
        this.studentClass = studentClass;
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");  
        this.birthday = date.format(date.parse(birthday));
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + studentClass + " " + birthday + " " + String.format("%.2f", GPA);
    }
}

public class DanhSachDoiTuongSinhVien1 {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);

    int t = Integer.parseInt(sc.nextLine());
    while(t-- > 0) {
        String name = sc.nextLine();
        String studentClass = sc.nextLine();
        String birthday = sc.nextLine();
        float GPA = Float.parseFloat(sc.nextLine());
        Student student = new Student(name, studentClass, birthday, GPA);
        System.out.println(student);

    }

    sc.close();
  }
}