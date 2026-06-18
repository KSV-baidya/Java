
// PROGRAM 165
import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();

        // invoke the pattern needed to be p[rinted
    }

    static int series1(int n) {
        // Sum = 2-4+6-8+10-12+...n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 2 * i;
            } else {
                sum += 2 * i;
            }
        }
        return sum;
    }// method1

    static int series2(int n) {
        // Sum = x/2 + x/5 + x/8 + x/11 + ... n
        int sum = 0;
        int x = 1; // Assuming x is 1 for this example
        for (int i = 2; i <= n; i += 3) {
            sum += x / i;
        }
        return sum;
    }// method2
}
