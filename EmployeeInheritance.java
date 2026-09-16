import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return 0;
    }

    void display() {
        double bonus = calculateBonus();
        double total = salary + bonus;

        System.out.println("Name: " + name);
        System.out.printf("Salary: ₹%.2f%n", salary);
        System.out.printf("Bonus: ₹%.2f%n", bonus);
        System.out.printf("Total Compensation: ₹%.2f%n", total);
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (Manager/Developer): ");
        String type = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ₹");
        double salary = sc.nextDouble();

        if (salary < 0) {
            System.out.println("Invalid salary.");
            sc.close();
            return;
        }

        Employee employee;

        if (type.equalsIgnoreCase("Manager")) {
            employee = new Manager(name, salary);
        } else if (type.equalsIgnoreCase("Developer")) {
            employee = new Developer(name, salary);
        } else {
            System.out.println("Invalid employee type.");
            sc.close();
            return;
        }

        employee.display();

        sc.close();
    }
}