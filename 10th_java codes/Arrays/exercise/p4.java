
//take an input of  20 elements from user and and display the elements which are prime 
import java.util.Scanner;
import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter 20 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Prime elements:");

        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    x++;
                }
            }
            if (x == 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
