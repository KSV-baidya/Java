
// Wap a SDA to get the perfect number and buzz number stored insdie the array
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array input
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // switch input
        System.out.println("Enter 1 for perfect number search ");
        System.out.println("Enter 2 for buzz number search ");
        int s = in.nextInt();
        switch (s) {

            case 1:
                for (int i = 0; i < arr.length; i++) {
                    int sum = 0;
                    // Find all proper divisors (up to num/2 for efficiency)
                    for (int j = 1; j <= i / 2; j++) {
                        if (i % i == 0) {
                            sum = sum + j; // Add divisor to sum
                        }
                    }
                    // Check if sum of divisors equals the original number
                    if (sum == i && i > 0) {
                        System.out.println(i + ", ");
                    }
                }
                break;// case 1

            case 2:
                for (int i = 0; i < arr.length; i++) {
                    if (i % 7 == 0 || i % 10 == 7) {
                        System.out.println(i + ", ");
                    }
                }
                break; // case 2
            default:
                System.out.println("Invalid input");
        }

    }// mains

}
