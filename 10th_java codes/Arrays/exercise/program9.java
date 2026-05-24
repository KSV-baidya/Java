//accept values in an array and calculate the sum of one digit and two digit elemens and display them 

import java.util.Scanner;

public class program9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
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
        int sumOneDigit = 0;
        int sumTwoDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 == 0) {
                sumOneDigit += arr[i];
            } else if (arr[i] / 10 != 0 && arr[i] / 100 == 0) {
                sumTwoDigit += arr[i];
            }
        }
        System.out.println("Sum of one-digit elements: " + sumOneDigit);
        System.out.println("Sum of two-digit elements: " + sumTwoDigit);
    }
}
