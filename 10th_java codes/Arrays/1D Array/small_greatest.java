// take 10 different elements in an array and display the smallest
// and greatest element in the array

import java.util.Scanner;
import java.util.Arrays;

public class small_greatest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        // to get the elements of the array
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
        } // closing the for loop of getting the elements of the array
        int max = arr[0];
        int min = arr[0];
        // to get the greatest and smallest element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The greatest element in the array is: " + max);
        System.out.println("The smallest element in the array is: " + min);

    }
}