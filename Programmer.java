public class Programmer extends Administrator {
    private String programmingLanguage;
    private int projectsCompleted;

    public Programmer() {
        super();
    }

    public Programmer(String name, String employeeId, double salary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        if (projectsCompleted >= 0) {
            this.projectsCompleted = projectsCompleted;
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на " + programmingLanguage + ".");
    }

    public void debugCode() {
        System.out.println(getName() + " отлаживает код.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Язык программирования: " + programmingLanguage + ", Завершенные проекты: " + projectsCompleted;
    }
}