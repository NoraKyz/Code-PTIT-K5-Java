package obj;

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
