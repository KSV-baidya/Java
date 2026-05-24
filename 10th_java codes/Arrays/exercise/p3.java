//Take a input of 10 elements arrray and display all the negative elements from the array followed by positive numbers without chamging the order of the input 
import java.util.Scanner;
import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Negative elements:");
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Positive elements:");
        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
