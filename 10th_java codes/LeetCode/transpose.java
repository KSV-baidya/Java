// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array ");
        int limit1 = in.nextInt();
        System.out.println("Enter the maximum number of columns in the array");
        System.out.println("Enter 0 for the index where no value exist ");
        int limit2 = in.nextInt();
        int[][] arr = new int[limit1][limit2];
        for (int i = 0; i < limit1; i++) {
            for (int j = 0; j < limit2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[][] arr1 = new int[limit2][limit1];
        for (int i = 0; i < limit1; i++) {
            for (int j = 0; j < limit2; j++) {
                arr1[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }

    }// mains
}
