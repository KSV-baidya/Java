
// The array must had to be sorted 
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // setting the limit of the array
        System.out.println("Enter the limit of the array");
        int size = in.nextInt();
        int[] arr = new int[size];

        // taking the input of the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = in.nextInt();
        }

        // Entering the element to search inside the array
        System.out.println("Enter the element that you want to search ");
        int search = in.nextInt();

        // printing the output of the array
        int result = BS(arr, search);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("The element is found in the index " + result);

    }// mains

    public static int BS(int[] arr, int search) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2; // to store the mid index value of the array
            if (arr[mid] == search)
                return mid;
            else if (arr[mid] > search)
                e = mid - 1;
            else // arr[mid] < search
                s = mid + 1;
        } // while loop
        return -1;
    }// method
}// class
