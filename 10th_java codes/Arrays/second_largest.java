import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Enter the first element of the array ");
                arr[i] = in.nextInt();
            } else if (i == arr.length - 1) {
                System.out.println("Enter the last element of the array ");
                arr[i] = in.nextInt();
            } else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextInt();
            }
        } // input taking is completed
        int max = arr[0];
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("The second largest element is " + smax);
    }
}
