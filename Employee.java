public abstract class Employee {
    private String name;
    private String employeeId;
    private double salary;


    public Employee() {
        this.name = "Неизвестно";
        this.employeeId = "Без ID";
        this.salary = 0.0;
        Counter.incrementCount();
    }

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        Counter.incrementCount(); //+1
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public abstract void work();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s, ID: %s, Зарплата: %.2f", name, employeeId, salary);
    }
}