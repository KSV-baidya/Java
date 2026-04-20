
// The amstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an amstrong number because 1^3 + 5^3 + 3^3 = 153.
import java.util.Scanner;

public class AMSTRONG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is an Armstrong number ");
        int n = in.nextInt();
        int original = n;
        int x = 0;
        while (n != 0) {
            n /= 10;
            x++;
        } // to count the number of digits of the input
        n = original;
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += (int) Math.pow(last, x);
            n /= 10;
        } // addition of the digits of the input by putting the value of the power to each
          // of them
          // checking whether the sum is equal to the original number or not
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }

}