import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        double units = sc.nextDouble();

        if (units < 0) {
            System.out.println("Invalid units.");
        } else {
            double bill;

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = (100 * 2) + ((units - 100) * 3);
            } else {
                bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
            }

            System.out.printf("Total Electricity Bill: ₹%.2f%n", bill);
        }

        sc.close();
    }
}