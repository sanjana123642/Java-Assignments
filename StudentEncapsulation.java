import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100.");
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter roll number: ");
        student.setRollNo(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter course: ");
        student.setCourse(sc.nextLine());

        System.out.print("Enter marks: ");
        student.setMarks(sc.nextDouble());

        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Marks: " + student.getMarks());

        sc.close();
    }
}