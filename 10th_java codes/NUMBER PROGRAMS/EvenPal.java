
import java.util.Scanner;

public class EvenPal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired number to be checked is even palindrome or not ");
        int n = in.nextInt();
        int temp = n;
        int sum = 0;
        //number reversed 
        while (n != 0) {
            int last = n % 10;
            sum = sum * 10 + last;
            n /= 10;
        }
n = temp;
        // checking for palindrome
        if (sum == n) {
            System.out.println("The number is a palindrome");
            if (sum % 2 == 0) {
                System.out.println("The number is an even palindrome");
                System.out.println(" SO IT IS AN EVENPAL NUMBER");
            } else {
                System.out.println("The number is not an even palindrome");
            }
        } else {
            System.out.println("The number is not a palindrome");
            System.exit(0);
        }

    }

}
