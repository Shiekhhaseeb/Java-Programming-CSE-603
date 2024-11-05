// Employee.java    Part 1: Employee Salary Management System
public class Employee {
    private String name;
    private String ID;
    private double salary;

    public Employee(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public double calculateGrossSalary(double basicSalary, double hra, double allowances) {
        return basicSalary + hra + allowances;
    }

    public void applyBonus(double bonus) {
        salary += bonus;
        System.out.println("Updated Salary for " + name + ": " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", ID='" + ID + '\'' + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "E001", 50000);
        Employee emp2 = new Employee("Bob", "E002", 60000);

        double grossSalary1 = emp1.calculateGrossSalary(40000, 10000, 5000);
        System.out.println("Gross Salary for " + emp1 + ": " + grossSalary1);

        emp1.applyBonus(2000);
        emp2.applyBonus(1500);
    }
}
