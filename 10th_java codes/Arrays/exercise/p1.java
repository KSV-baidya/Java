//take a input of 20 elemenrs and display the sum of even and odd numbers separately
import java.util.Scanner;
import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        //storing the elemenrs in the array
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Enter the first element of the array");
                arr[i] = in.nextInt();
            } else if (i == arr.length) {
                System.out.println("Enter the last element of the array");
                arr[i] = in.nextInt();
            } else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextInt();
            }  
        }//input taking of the elements in the array is done
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("Sum of even elements: " + sumEven);
        System.out.println("Sum of odd elements: " + sumOdd);
    }
}
