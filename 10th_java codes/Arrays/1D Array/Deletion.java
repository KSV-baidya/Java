import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the index number to be deleted. ");
        int del = in.nextInt();

        for (int i = del; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }// mains
}// class
