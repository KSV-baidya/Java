//WAP to calculate the sum of all the positive even numbers and sum of all negative odd numbers from a set of numbers. you can enter 0 to quit the program and display the result.

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        System.out.println("Enter numbers (0 to quit): ");
        int n = in.nextInt();
        // to do the additiin protion of the program and also to check
        while (n != 0) {
            // Checking the the value of n is whether positive even or negative odd and
            // adding to the respective sum
            if (n > 0 && n % 2 == 0)
                s1 += n;
            else if (n < 0 && n % 2 != 0) {
                s2 += n;
            } 
            // analysing to either contiue the loop or break it
            System.out.println("do u want to continue? ");
            System.out.println("Enter a number to comtinue or 0 to quit ");
            n = in.nextInt();
        }
        // displaying the result
        System.out.println("Sum of all positive even numbers: " + s1);
        System.out.println("Sum of all negative odd numbers: " + s2);
    }
}
