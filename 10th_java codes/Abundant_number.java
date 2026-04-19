//TO CHECK WHETHER THE NUMBERE IS A ABUNDANT NUMBER OR NOT 
import java.util.Scanner;

public class Abundant_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        // taking the input number from the user
        int n = in.nextInt();
        int sum = 0;
        //to get the sum of the factors of the number except the number itself
        for (int i = 1; i < n; i++) { // to write for loop condition -- i<=(n-1)
            if (n % i == 0) {
                sum += i;
            }
        }
        //Checking whether the sum of the factors is greater than the number itself or not
        if (sum > n) {
            System.out.println(n + " is an abundant number.");
        } else {
            System.out.println(n + " is not an abundant number.");
        }
    }  
}