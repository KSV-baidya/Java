//Norm is the square root of sum of the squares of each element of the array

import java.util.Scanner;

public class norm_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Enter the length of the 2D array
        System.out.println("Enter the number of rows for the array ");
        int row = in.nextInt();
        System.out.println("Enter the number of columns for the array ");
        int col = in.nextInt();
        int[][] arr = new int[row][col];

        // taking the element of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += Math.pow(arr[i][j], 2);
            }
        }

        double norm = Math.sqrt(sum);
        System.out.println("The norm of the array is " + norm);

    }// mains

}
