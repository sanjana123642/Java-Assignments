import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        boolean failed = false;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks.");
                sc.close();
                return;
            }

            total += marks;

            if (marks < 40) {
                failed = true;
            }
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (failed) {
            System.out.println("FAIL");
        } else {
            System.out.println("PASS");
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}