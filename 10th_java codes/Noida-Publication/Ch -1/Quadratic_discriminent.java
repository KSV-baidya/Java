// # program -- 148
// WAP to print the nature of the roots 

import java.util.Scanner;

public class Quadratic_discriminent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input + functionality
        System.out.print("Enter the coefficient a: ");
        double a = in.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = in.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = in.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("The equation has two distinct real roots.");
        } else if (discriminant == 0) {
            System.out.println("The equation has one real root (a repeated root).");
        } else {
            System.out.println("The equation has no real roots (the roots are complex).");
        }
    }
}
