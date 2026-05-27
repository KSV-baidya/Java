//take input of 4*4 matrix. 
//Display the matrix element..(i) 
//Display the largest nd smallest of the elements..(ii)
//Difference between largest and smallest..(iii)

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The largest element " + large(arr));
        System.out.println("The smallest element " + small(arr));

        // the difference
        int d = large(arr) - small(arr);
        System.out.println("The diffference between largest and smallest element is " + d);

    }// mains

    // to find the largest
    static int large(int[][] arr) {
        int largest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }// method1

    // to find the smallest
    static int small(int[][] arr) {
        int smallest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        return smallest;
    }// method2

}