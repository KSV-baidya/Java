// PRogram -- 159 

// Using the switch statement, write a menu-driven program to:

// (i) Generate and display the first 10 terms of the Fibonacci series 0,1,1,2,3,5,....
// The first two Fibonacci numbers are 0 and 1 and each subsequent number is the sum of the previous two.

// (ii) Find the sum of the digits of an integer that is input.
// Sample Input: 15390
// Sample Output: Sum of the digits = 18

// (iii) For an incorrect choice, an appropriate error message should be displayed.

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Generate Fibonacci series");
        System.out.println("2. Find sum of digits of an integer");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                int a = 0, b = 1, c;
                System.out.print("Enter the number of rows: ");
                int rows = in.nextInt();
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(a + " ");

                        c = a + b;
                        a = b;
                        b = c;
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("Enter an integer: ");
                int num = in.nextInt();
                int sum = 0;
                int temp = num;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                System.out.println("Sum of the digits = " + sum);
                break;
            default:
                System.out.println("Error: Invalid choice. Please select 1 or 2.");
        }
    }
}