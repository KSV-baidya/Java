
//A perfect number is a number whose sum of the factors of the number ( except the number itself) is equal to that of the number 
import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a perfect number or not. ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println("Yes it is a perfect number.");
        else
            System.out.println("No it is not a perfect number.");

    }
}
