import java.util.Scanner;

public class value_swapping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        // taking input of the array
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                System.out.println("Enter the first element of the array");
                arr[i] = in.nextInt();
            } else if (i == arr.length) {
                System.out.println("Enter the last element of the array");
                arr[i] = in.nextInt();
            } else {
                System.out.println("Enter the next element of the array");
                arr[i] = in.nextInt();
            }
        } // closing the input taking process

        // swapping the index value of arr[1] and arr[3]
        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        // SWAPPING COMPLETED OF TWO ARRAY INDEX
    }
}
