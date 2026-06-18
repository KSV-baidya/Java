// PRogram -- 160 
//Write a menu-based program that outputs the results of the following evaluations based on the number entered by the user:

// (i) Absolute value of the number
// (ii) Square root of the number
// (iii) Random numbers between 0 and 1

import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Absolute value");
        System.out.println("2. Square root");
        System.out.println("3. Random numbers");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num1 = in.nextInt();
                System.out.println("Absolute value = " + Math.abs(num1));
                break;
            case 2:
                System.out.print("Enter a number: ");
                double num2 = in.nextDouble();
                System.out.println("Square root = " + Math.sqrt(num2));
                break;
            case 3:
                System.out.println("Random numbers between 0 and 1:");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Math.random());
                }
                break;
            default:
                System.out.println("Error: Invalid choice. Please select 1, 2, or 3.");
        }
    }
}
