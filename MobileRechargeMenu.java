import java.util.Scanner;

public class MobileRechargeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mobile Recharge Plans");
        System.out.println("1. ₹199 - 1.5 GB/day - 28 days");
        System.out.println("2. ₹299 - 2 GB/day - 28 days");
        System.out.println("3. ₹499 - 3 GB/day - 56 days");

        System.out.print("Enter your plan choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Plan: ₹199");
                System.out.println("Data: 1.5 GB/day");
                System.out.println("Validity: 28 days");
                break;

            case 2:
                System.out.println("Plan: ₹299");
                System.out.println("Data: 2 GB/day");
                System.out.println("Validity: 28 days");
                break;

            case 3:
                System.out.println("Plan: ₹499");
                System.out.println("Data: 3 GB/day");
                System.out.println("Validity: 56 days");
                break;

            default:
                System.out.println("Invalid plan choice.");
        }

        sc.close();
    }
}