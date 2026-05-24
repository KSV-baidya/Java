//Take a input of 10 element array and a number and find the number in the array using linear search

import java.util.Scanner;

public class search_element {

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
        }
        // closing the for loop of storing the elements in the array
        System.out.println("Enter the number to be searched in the array");
        int num = in.nextInt();
        boolean found = false;
        //checking if the number is present in the array or not
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("The number is found in the array at index: " + i);
                found = true;
                break;

            } else {
                continue;
            }
        }
        if (found == false) {
            System.out.println("The number is not found in the array");
        }
    }
}
