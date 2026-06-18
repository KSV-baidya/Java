// PRogram -- 149

/* A set of two linear equations with two unknown values x_{1} and are x_{2} given as:

(i)   m = a*x_{1} + b*x_{2}
(ii)  n = c*x_{1} + d*x_{2}

The solution of the equation is given as:

(i) x{1} = (md - bn)/(ad - cb)
(ii) x{2} = (na - mc)/(ad - cb)

Provided that the denominator ad - cb is not equal to 0.
Write an appropriate message. Write a Java program that will read the values of a, b, c, d, m, and n and computes and displays the results x_{1} and x_{2} .
*/

import java.util.Scanner;

public class Liinear_equations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = in.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = in.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = in.nextDouble();
        System.out.print("Enter the value of d: ");
        double d = in.nextDouble();
        System.out.print("Enter the value of m: ");
        double m = in.nextDouble();
        System.out.print("Enter the value of n: ");
        double n = in.nextDouble();

        // Calculate the denominator
        double denominator = a * d - b * c;

        // Check if the denominator is zero
        if (denominator == 0) {
            System.out.println("The system of equations has no unique solution since the denominator is zero.");
        } else {
            // Calculate the values of x1 and x2
            double x1 = (m * d - b * n) / denominator;
            double x2 = (n * a - c * m) / denominator;

            // Display the results
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}