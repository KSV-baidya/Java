// program -- 151

import java.util.Scanner;

class largest_of_3input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = in.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = in.nextDouble();

        double largest = largest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }// mains

    static double largest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1; // num1 is the largest
        } else if (num2 >= num1 && num2 >= num3) {
            return num2; // num2 is the largest
        } else {
            return num3; // num3 is the largest
        }
    }// method
}