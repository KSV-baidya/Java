//take a input of 20 elements ofd double datatype and do the following 
// print the product of the elements 
// print the square of the each elements

import java.util.Scanner;
import java.util.Arrays;    


public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[20];
        //storing the elemenrs in the array
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Enter the first element of the array");
                arr[i] = in.nextDouble();
            } else if (i == arr.length) {
                System.out.println("Enter the last element of the array");
                arr[i] = in.nextDouble();
            } else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextDouble();
            }  
        }//input taking of the elements in the array is done
        double product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Product of the elements: " + product);
        System.out.println("Squares of the elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "^2 = " + (arr[i] * arr[i]));
        }
    }
}
