import java.util.Arrays;
import java.util.Scanner;

public class REVERSE_ARRAY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the limit of the array ");
        // int limit = in.nextInt();
        int[] arr = new int[5];
        // taking input of the array
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Enter the first element of the array");
                arr[i] = in.nextInt();
            } else if (i == arr.length - 1) {
                System.out.println("Enter the last element of the array");
                arr[i] = in.nextInt();
            } else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextInt();
            }
        } // input array completed
        System.out.println("BEFORE REVERSE");
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("AFTER REVERSE");
        System.out.println(Arrays.toString(arr));
    }

}