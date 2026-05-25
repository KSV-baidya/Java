import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be inserted");
        int element = sc.nextInt();
        System.out.println("Enter the position where the element is to be inserted");
        int position = sc.nextInt();
        // position is counted from index 0

        for (int i = n - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
