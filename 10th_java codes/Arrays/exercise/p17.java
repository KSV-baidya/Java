//write a program for a 4*4 matrix and find the sum of diagonals

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        } // input
        System.out.println("Left diagoanl sum "+Left_Diagonal(arr));
        System.out.println(" Right diagoanl sum "+right_Diagosnal(arr));

      }// mains
  
 static int Left_Diagonal(int [][]arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if ( i*i == j*j)
                sum += arr[i][j];
        }
    } 
    return sum;
}//function1

 static int right_Diagonal(int [][] arr){
int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if ( i+j == arr.length)
                sum += arr[i][j];
        }
    } 
    return sum;
}//function2
}





}
