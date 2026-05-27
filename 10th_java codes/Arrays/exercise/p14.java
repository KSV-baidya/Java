
//take input of names, roll numbers and marks of 3 subjects of n number of students by using 5 single dimensional arrays and amake a grade system for hem
import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = in.nextInt();
        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        int[] marks1 = new int[n];
        int[] marks2 = new int[n];
        int[] marks3 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = in.next();
            System.out.print("Roll Number: ");
            rollNumbers[i] = in.nextInt();
            System.out.print("Marks in Subject 1: ");
            marks1[i] = in.nextInt();
            System.out.print("Marks in Subject 2: ");
            marks2[i] = in.nextInt();
            System.out.print("Marks in Subject 3: ");
            marks3[i] = in.nextInt();
        }

        // Average calculator and grade system
        for (int i = 0; i < n; i++) {
            int totalMarks = marks1[i] + marks2[i] + marks3[i];
            double averageMarks = totalMarks / 3.0;
            String grade;

            if (averageMarks >= 85 && averageMarks <= 100) {
                grade = "Excellent";
            } else if (averageMarks >= 75 && averageMarks < 85) {
                grade = "Distinction";
            } else if (averageMarks >= 60 && averageMarks < 75) {
                grade = "First Class";
            } else if (averageMarks >= 40 && averageMarks < 60) {
                grade = "pass";
            } else if (averageMarks < 40 && averageMarks >= 0) {
                grade = "Fail";
            } else
                grade = "Invalid Marks";
            System.out.println("Student: " + names[i] + ", Roll Number: " + rollNumbers[i] + ", Average Marks: "
                    + averageMarks + ", Grade: " + grade);
        }
    }
}
