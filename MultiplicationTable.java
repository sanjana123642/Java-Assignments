import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter ending multiplier: ");
        int end = sc.nextInt();

        if (end <= 0) {
            System.out.println("Invalid ending multiplier.");
        } else {
            for (int i = 1; i <= end; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        sc.close();
    }
}