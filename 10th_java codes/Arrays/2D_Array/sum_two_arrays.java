// Write a program in Java to store the numbers in two different Double Dimensional Arrays m[4][4] and n[4][4].
// Find the sum of the numbers of the corresponding elements of the two arrays m and n and store them in the array p[4][4] by using an Input statement. 
// Display the elements of array p in a matrix form.

import java.util.Scanner;
import java.util.Arrays;

public class sum_two_arrays {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        int[][] n = new int[4][4];
        int[][] p = new int[4][4];

        // taking the input of the first array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the first array m[4][4] ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = in.nextInt();
            }
        }

        // taking the input of the second array
        System.out.println("Enter the elements of the second array n[4][4] ");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                p[i][j] = m[i][j] + n[i][j];
            }
        }
        // displaying array p
        System.out.println("The sum of the two arrays is ");
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }// mains

}
