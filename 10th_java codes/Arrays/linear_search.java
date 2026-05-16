import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];

        // enter the elements of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // taking input to search the index of the element
        System.out.println("Enter the search element to get the index");
        int target = in.nextInt();

        if (L_search(arr, target) != -1) {
            System.out.println("The element is found at index " + L_search(arr, target));
        } else
            System.out.println("It is not found");
    }

    public static int L_search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}