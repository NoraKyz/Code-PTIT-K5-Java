import java.util.*;

class Teacher {

  public String ID, Name;
  public long Level, Salary, Subsidy, Income;

  public Teacher(String ID, String Name, long Salary) {
    this.ID = ID;
    this.Name = Name;
    this.Salary = Salary;
    if (ID.charAt(1) == 'T')
      this.Subsidy = 2000000;
    else if (ID.charAt(1) == 'P')
      this.Subsidy = 900000;
    else
      this.Subsidy = 500000;
    this.Level = 0;
    for (int i = 2; i < 4; ++i)
      this.Level = this.Level * 10 + (this.ID.charAt(i) - '0');
    this.Income = this.Salary * this.Level + this.Subsidy;
  }
}

public class TinhThuNhapGiaoVien {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Teacher A = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
    System.out.printf("%s %s %d %d %d", A.ID, A.Name, A.Level, A.Subsidy, A.Income);

    sc.close();
  }
}