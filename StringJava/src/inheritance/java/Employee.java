package inheritance.java;

class Employee {

    private String name;
    private double salary;

    public void setData(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}

class Manager extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void Setbonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncome() {
        double amt = getSalary() + bonus;

        return amt;
    }

}

class UseManager {

    public static void main(String[] args) {
        Manager boss = new Manager();

        boss.setData("Satyam", 40000);
        boss.Setbonus(20000);

        System.out.println("Name of Boss= " + boss.getName());
        System.out.println("Income of Boss= " + boss.getIncome());
        System.out.println("Salary of boss= " + boss.getSalary());

        System.out.println("Total Bonus = " + boss.getBonus());

    }
}
