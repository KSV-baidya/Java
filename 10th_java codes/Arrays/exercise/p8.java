import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 110061, 110001, 110029, 110023, 110006, 110019, 110033 };
        SC(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }// mains

    public static void SC(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int small = i;

            // finding smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[small]) {
                    small = j;
                }
            }

            // swap AFTER inner loop
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
    }// method
}
