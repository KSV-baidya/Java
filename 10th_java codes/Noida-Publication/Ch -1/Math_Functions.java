
// Program -- 153

// Write a Java program that displays the result of the following evaluations
// based on the user's entry of choice from the keyboard:

// (i) Natural logarithm of a number.
// (ii) Absolute value of a number.
// (iii) Square root of a number.
// (iv) Random number between 0 and 1.

import java.util.Scanner;

public class Math_Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Natural logarithm of a number");
        System.out.println("2. Absolute value of a number");
        System.out.println("3. Square root of a number");
        System.out.println("4. Random number between 0 and 1");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double num1 = in.nextDouble();
                if (num1 > 0) {
                    System.out.println("Natural logarithm of " + num1 + " is: " + Math.log(num1));
                } else {
                    System.out.println("Please enter a positive number for logarithm.");
                }
                break;
            case 2:
                System.out.print("Enter a number: ");
                double num2 = in.nextDouble();
                System.out.println("Absolute value of " + num2 + " is: " + Math.abs(num2));
                break;
            case 3:
                System.out.print("Enter a number: ");
                double num3 = in.nextDouble();
                if (num3 >= 0) {
                    System.out.println("Square root of " + num3 + " is: " + Math.sqrt(num3));
                } else {
                    System.out.println("Please enter a positive number for square root.");
                }
                break;
            case 4:
                System.out.println("Random number between 0 and 1: " + Math.random());
                break;
            default:
                System.out.println("Invalid choice. Please select from the options.");
        }
    }

}