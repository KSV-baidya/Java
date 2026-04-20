import java.util.Scanner;

// To check whether the number is a neon number or not
// A neon number is a number where the sum of the digits of the square of the number is equal to the number itself. 
public class neon_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a neon number or not");
        int n = in.nextInt();
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is a neon number.");
        } else {
            System.out.println(n + " is not a neon number.");
        }
    }
}
