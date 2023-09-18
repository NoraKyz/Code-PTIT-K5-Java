import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Student implements Comparable<Student> {
  private String ID;
  private String name;
  private String studentClass;
  private String birthday;
  private float GPA;
  private static int cnt = 1;

  public Student(String name, String studentClass, String birthday, float GPA) throws ParseException {
    ID = String.format("B20DCCN%03d", cnt++);
    this.name = "";
    String s = name.trim().toLowerCase();
    String[] a = s.split("\\s+");
    for (String i : a)
      this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
    this.name = this.name.trim();
    this.studentClass = studentClass;
    DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    this.birthday = date.format(date.parse(birthday));
    this.GPA = GPA;
  }

  @Override
  public String toString() {
    return ID + " " + name + " " + studentClass + " " + birthday + " " + String.format("%.2f", GPA);
  }

  @Override
  public int compareTo(Student o) {
    if (GPA < o.GPA)
      return 1;
    else if (GPA > o.GPA)
      return -1;
    else
      return ID.compareTo(o.ID);
  }
}

public class DanhSachDoiTuongSinhVien3 {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);

    Student[] students = new Student[100];

    int t = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < t; i++) {
      String name = sc.nextLine();
      String studentClass = sc.nextLine();
      String birthday = sc.nextLine();
      float GPA = Float.parseFloat(sc.nextLine());
      students[i] = new Student(name, studentClass, birthday, GPA);
    }

    Arrays.sort(students, 0, t);
    
    for(int i = 0; i < t; i++) {
      System.out.println(students[i].toString());
    }

    sc.close();
  }
}