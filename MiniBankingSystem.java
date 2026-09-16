import java.util.Scanner;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposit Successful.");
            System.out.printf("Current Balance: ₹%.2f%n", balance);
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.printf("Current Balance: ₹%.2f%n", balance);
        }
    }

    // Display balance
    void showBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    // Display account details
    void displayAccount() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.printf("Balance: ₹%.2f%n", balance);
    }
}

public class MiniBankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = null;
        int choice;

        do {
            System.out.println("\n===== MINI BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Display Account");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (account != null) {
                        System.out.println("Account already exists.");
                    } else {
                        System.out.print("Enter account number: ");
                        String accountNumber = sc.nextLine();

                        System.out.print("Enter account holder name: ");
                        String holderName = sc.nextLine();

                        System.out.print("Enter opening balance: ₹");
                        double balance = sc.nextDouble();

                        if (balance < 0) {
                            System.out.println("Invalid opening balance.");
                        } else {
                            account = new Account(
                                    accountNumber,
                                    holderName,
                                    balance
                            );

                            System.out.println("Account created successfully.");
                        }
                    }
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter deposit amount: ₹");
                        double amount = sc.nextDouble();

                        account.deposit(amount);
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter withdrawal amount: ₹");
                        double amount = sc.nextDouble();

                        account.withdraw(amount);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        account.showBalance();
                    }
                    break;

                case 5:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    } else {
                        account.displayAccount();
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Mini Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-6.");
            }

        } while (choice != 6);

        sc.close();
    }
}