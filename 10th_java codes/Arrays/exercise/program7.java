/* 
take a 20 element array and do the following 
1. total number of even integers 
2. total number of odd integers
3. total number of multiples of 4 
 */

import java.util.Scanner;

public class program7 {

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
        //sorting the array in ascending order
        int evenCount = 0;
        int oddCount = 0;
        int multiplesOf4Count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (num % 4 == 0) {
                multiplesOf4Count++;
            }
        }

        System.out.println("Total number of even integers: " + evenCount);
        System.out.println("Total number of odd integers: " + oddCount);
        System.out.println("Total number of multiples of 4: " + multiplesOf4Count);
    }
}
