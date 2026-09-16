import java.util.Scanner;

public class ATMCashWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ₹");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ₹");
        double withdrawal = sc.nextDouble();

        if (balance < 0 || withdrawal <= 0) {
            System.out.println("Invalid amount.");
        } else if (withdrawal % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of ₹100.");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - withdrawal;

            System.out.println("Withdrawal Successful");
            System.out.printf("Remaining Balance: ₹%.2f%n", balance);
        }

        sc.close();
    }
}