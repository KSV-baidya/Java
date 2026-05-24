//Accept 20 different elemets and display the sum of the elements which are divisible by 5 or 3 

import java.util.Scanner;
import java.util.Arrays;

public class divisable_by_3_or_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        //storing the elemenrs in the array 
        for (int i = 0; i < arr.length; i++) {
            if ( i == 0) {
                System.out.println("Enter the first element of the array");
                arr[i] = in.nextInt();
            } else if (i == arr.length) {
                System.out.println("Enter the last element of the array");
                arr[i] = in.nextInt();
            }
            else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextInt();
            }
        }//  closing the for loop of storing the elements in the array

        int sum = 0;
        //to get the sum of the elements which are divisible by 5 or 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 || arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of the elements which are divisible by 5 or 3 is: " + sum);
    }
}
