import java.util.Scanner;

public class left_diagonal_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // initialiting the 2D array
        System.out.println("Enter the no of rows. ");
        int row = in.nextInt();
        System.out.println("Enter the no of columns. ");
        int col = in.nextInt();
        int[][] arr = new int[row][col];

        // taking the element input of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // left diagnal sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    sum += arr[i][j];
            }
        }
        System.out.println("The sum of the left diagonal is " + sum);

    }
}
