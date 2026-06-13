
//all the searching methods in the array 

import java.util.Scanner;

public class Search-array
{

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = in.nextInt();
        int[] arr = new int[size];

        // input of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // SEARCH INPUT
        System.out.println("Enter the elemet that u want to search ");
        int search = in.nextInt();

        // Invoke the method that u want to print of

    }// mains

    static int LinearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }// LinearSearch

    static int BinarySearch(int[] arr, int search) {
        int s = 0;
        int e = arr.length - 1;
        while (s >= e) {
            int mid = s - (e + s) / 2;
            if (arr[mid] == search)
                return mid;
            else if (search < arr[mid])
                e = mid - 1;
            else // arr[mid] > search
                s = mid + 1;

        }
        return -1;

    }// BnarySearch

}
