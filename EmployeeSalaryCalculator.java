import java.util.Scanner;

public class EmployeeSalaryCalculator {

    static double calculateHRA(double basic) {
        return basic * 0.20;
    }

    static double calculateDA(double basic) {
        return basic * 0.10;
    }

    static double calculateAllowance(double basic) {
        if (basic > 50000) {
            return basic * 0.05;
        } else {
            return basic * 0.02;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ₹");
        double basic = sc.nextDouble();

        if (basic < 0) {
            System.out.println("Invalid salary.");
        } else {
            double hra = calculateHRA(basic);
            double da = calculateDA(basic);
            double allowance = calculateAllowance(basic);

            double grossSalary = basic + hra + da + allowance;

            System.out.printf("HRA: ₹%.2f%n", hra);
            System.out.printf("DA: ₹%.2f%n", da);
            System.out.printf("Special Allowance: ₹%.2f%n", allowance);
            System.out.printf("Gross Salary: ₹%.2f%n", grossSalary);
        }

        sc.close();
    }
}