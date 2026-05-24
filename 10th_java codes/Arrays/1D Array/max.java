
import java.util.Scanner;
import java.util.Arrays;

public class max {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
         //to get the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = in.nextInt();
        }
         //to get the maximum element in the array
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
         //Displaying the maximum element in the array
        System.out.println("The maximum element in the array is: " + max);
    }
}
