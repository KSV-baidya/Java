import java.util.Scanner;

public class selection_sort_descending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array input
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        SC(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }// mains

    public static void SC(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int large = i;

            // finding largest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[large]) {
                    large = j;
                }
            }

            // swap AFTER inner loop
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
        }
    }// method
}
