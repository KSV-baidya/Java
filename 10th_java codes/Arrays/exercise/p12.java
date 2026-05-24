import java.util.Scanner;
//tale input of first array and second array and print the smallest value of a certain index in third array

public class p12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array input
        System.out.println("Enter the size of first array ");
        int size1 = in.nextInt();
        System.out.println("Enter the size of second array ");
        int size2 = in.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int orj = 0;
        if (size1 > size2) {
            orj = size1;
        } else
            orj = size2;
        int[] arr3 = new int[orj];

        BS(arr1, arr2, arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
    }// mains

    public static void BS(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr1[i] < arr2[i])
                arr3[i] = arr1[i];
            else if (arr1[i] > arr2[i])
                arr3[i] = arr2[i];
            else
                arr3[i] = arr1[i];

        }
    }// method
}
