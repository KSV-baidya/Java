import java.util.Scanner;

public class sum_eachcol {

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

        // sum of each column
        for (int c = 0; c < col; c++) {
            int sum = 0;
            for (int r = 0; r < arr[c].length; r++) {
                sum += arr[r][c];
            }
            System.out.println("The sum of column " + c + 1 + " is " + sum);
        }

    }// mains
}// class
