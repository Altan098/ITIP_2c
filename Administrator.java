public class Administrator extends Employee {
    private String department;

    public Administrator() {
        super();
        this.department = "Нету";
    }

    public Administrator(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет отделом " + department);
    }

    public void Meeting() {
        System.out.println(getName() + " проводит совещание.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Отдел: " + department;
    }
}