//  # PROGRAM -- 142

// Check if a number is on the number is postive or negative or zero 

import java.util.Scanner;

class numberline_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = in.nextDouble();
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }// mains
}