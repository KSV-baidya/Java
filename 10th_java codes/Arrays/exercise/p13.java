
//take input to accept the year of graduation from school as an integer value. 
// Using BINARY SEARCH O/P the message: "Reord exists" if it is available or "Record does not exist" if it is not available.
import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of years of graduation you want to record: ");
        int limit = in.nextInt();
        int[] arr = new int[limit];

        // input take
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the year of graduation for record " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        } // loop end
        sorting_array(arr);

        System.out.println("Enter the year of graduation to search: ");
        int target = in.nextInt();

        // printing the result of binary search
        boolean recordExists = false;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Record does not exist");
        } else {
            recordExists = true;
            System.out.println("Record exists");
        }

    }// mains

    // sorting the array in ascending order for Binary search to work properly
    static void sorting_array(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    // binary search method to search the target value in the array
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // target value is greater than mid value so we will search in right half
            } else { // target value is less than mid value so we will search in left half
                right = mid - 1;
            }

        }
        return -1; // target value not found in the array
    }
}
