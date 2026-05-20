//WAP a program to find the sum of the outer boarder of a 2D array

import java.util.Scanner;

public class outer_boarder_sum {
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

        // Finding out the sum of the boundaries]\
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[i].length - 1)
                    sum += arr[i][j];
            }

        }
    }

}
