// To calculate the norm of the input digit 
// the norm of a number is the square root of the sum of the squares of its digits

import java.util.Scanner;
public class NORM_CALCULATOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to calculate its norm ");
        int n = in.nextInt();
         int sum = 0;
        while (n != 0) {
            int digit = n % 10; // to get the last digit of the number
            sum += digit * digit; // to calculate the square of the digit and add it to the sum
            n /= 10; // to remove the last digit from the number
        }
        double norm = Math.sqrt(sum); // to calculate the square root of the sum
        System.out.println("The norm of the number is: " + norm);
    }
}
