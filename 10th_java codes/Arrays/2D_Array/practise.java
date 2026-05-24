import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // row = no. of rows
        // col = no. of cloumns
        int row = 5;
        int col = 5;
        int[][] arr = new int[row][col];

        // manual coding input
        // int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        // //manual printing

        // printing method for schol exam
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // takig user input
        // 3 = no of rows = r
        // arr[r].length = no of columns = c for r
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                arr[r][c] = in.nextInt();
            }
        }

    }
}
