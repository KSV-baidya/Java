import java.util.Scanner;

public class sum_eachrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = in.nextInt();
        System.out.println("Enter the number of colums each row ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];

        // array element into the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of the elements of the row number " + i + 1 + " is " + sum);
        }

    }// mains
}// class
