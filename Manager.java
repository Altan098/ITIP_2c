public class Manager extends Administrator {
    private int teamSize;
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, String employeeId, double salary, String department, int teamSize, double bonus) {
        super(name, employeeId, salary, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " руководит командой из " + teamSize + " человек.");
    }

    public void report() {
        System.out.println(getName() + " составляет отчет.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Размер команды: " + teamSize + ", Бонус: " + bonus;
    }
}