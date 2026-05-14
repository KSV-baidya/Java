import java.util.Scanner;

public class magic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int sum = n;

        // Repeat until sum becomes a single digit
        while (sum > 9) {
            int temp = sum;
            sum = 0;

            while (temp != 0) {
                int last = temp % 10;
                sum += last;
                temp /= 10;
            }
        }

        if (sum == 1) {
            System.out.println("Yes, it is a magic number.");
        } else {
            System.out.println("Not a magic number.");
        }

        in.close();
    }
}