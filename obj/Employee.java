package obj;


class Employee { 
    public String id;
    public String name;
    public long baseSalary;
    public long workday;
    public String department;
    public static int count = 1;

    public Employee(String name, long baseSalary, long workday, String department) {
        this.id = "NV" + String.format("%02d", count);
        this.name = name;
        this.baseSalary = baseSalary;
        this.workday = workday;
        this.department = department;
        count++;
    };

    public long getMonthlySalary() {
        return this.baseSalary * this.workday;
    }

    public long getBonus() {
        if(this.workday >= 25) {
            return this.getMonthlySalary() / 5;
        } else if(this.workday >= 22) {
            return this.getMonthlySalary() / 10;
        } else {
            return 0;
        }
    }

    public long getAllowance() {
        if(this.department.equals("GD")) {
            return 250000;
        } else if(this.department.equals("PGD")) {
            return 200000;
        } else if(this.department.equals("TP")) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public long getSalary() {
        return this.getMonthlySalary() + this.getBonus() + this.getAllowance();
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.getMonthlySalary() + " " + this.getBonus() + " " + this.getAllowance() + " " + this.getSalary();
    }
}
