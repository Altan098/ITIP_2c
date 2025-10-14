public class Main {
    public static void main(String[] args) {

        Administrator admin = new Administrator("Максим Ященко", "A001", 50000, "806Б");
        Manager manager = new Manager("Лео Леонтьев", "M001", 70000, "Продажи", 2, 10000);
        Programmer programmer = new Programmer("Саргей Павлов", "П001", 80000, "IT", "Java", 3);
        programmer.setName("Sergei");
        Programmer programmer1 = new Programmer("Макс Какой-то", "П002", 100000, "IT", "Python", 14);
        Administrator admin1 = new Administrator();
        System.out.println("Имя: " + admin1.getName());
        admin1.setName("Alex");
        System.out.println("ID: " + admin1.getEmployeeId());
        System.out.println("Зарплата: " + admin1.getSalary());
        System.out.println("Отдел: " + admin1.getDepartment());
        Employee[] employees = {admin, manager, programmer, programmer1};
        System.out.println("");
        System.out.println(" Работа");
        for (Employee emp : employees) {
            emp.work();
        }

        System.out.println("\nСотрудники");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        System.out.println("объектов: " + Counter.getCount());

        System.out.println("\nСпецметоды");
        admin.Meeting();
        manager.report();
        programmer.debugCode();
        programmer1.debugCode();
    }
}