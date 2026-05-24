//write a input of a 2D array and find the highest and the lowest element 

import java.util.Scanner;

public class highest_smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Enter the length of the 2D array
        System.out.println("Enter the number of rows for the array ");
        int row = in.nextInt();
        System.out.println("Enter the number of columns for the array ");
        int col = in.nextInt();
        int[][] arr = new int[row][col];

        // Stroage and display
        int highest = highest(arr);
        int smallest = smallest(arr);
        System.out.println("The largest value of the array is " + highest + " and the smallest value is " + smallest);

    }// mains

    public static int highest(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }// method for maximum

    public static int smallest(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }// method for minimum

}// class
