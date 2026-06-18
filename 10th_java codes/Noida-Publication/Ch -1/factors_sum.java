
// PROGRAM -- 167 
// to find the sum of factors of a number
import java.util.Scanner;

public class factors_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of factors: " + sum);
    }
}
