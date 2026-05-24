
//LINEAR SEARCH IN 2D ARRAY 
import java.util.Scanner;

public class Linear_search {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = in.nextInt();
        System.out.println("Enter the number of colums each row ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];

        // taking the input of the element of the array
        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                arr[r][c] = in.nextInt();
            }
        }

        // taking the variable we need it to search
        System.out.println("Enter the value to search  ");
        int search = in.nextInt();

        // linear search in 2D array
        boolean found = false;
        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                if (arr[r][c] == search) {
                    System.out.println("Element found at index " + r + " " + c);
                    found = true;
                    break;
                }
            }
        }
        if (found == false) {
            System.out.println("Element not found in the array");
        }
    }// mains
}// class