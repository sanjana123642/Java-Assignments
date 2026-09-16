import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ₹");
        double amount = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter membership type (Premium/Regular): ");
        String membership = sc.nextLine();

        if (amount < 0) {
            System.out.println("Invalid purchase amount.");
        } else {
            double discountRate = 0;

            if (membership.equalsIgnoreCase("Premium")) {
                if (amount >= 5000) {
                    discountRate = 0.10;
                } else {
                    discountRate = 0.05;
                }
            } else if (membership.equalsIgnoreCase("Regular")) {
                if (amount >= 5000) {
                    discountRate = 0.02;
                }
            } else {
                System.out.println("Invalid membership type.");
                sc.close();
                return;
            }

            double discount = amount * discountRate;
            double finalAmount = amount - discount;

            System.out.printf("Discount: ₹%.2f%n", discount);
            System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
        }

        sc.close();
    }
}