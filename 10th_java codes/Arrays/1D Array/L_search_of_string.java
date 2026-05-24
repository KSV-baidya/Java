//LNEAR SEARCH FOR STRING VARIABLE

import java.util.Scanner;
import java.util.Arrays;

public class L_search_of_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter limit of the array ");
        int limit = in.nextInt();
        String[] arr = new String[limit];

        // taking input of the array element
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elemets of the array ");
            arr[i] = in.nextLine();
        }

        // taking the input of the search elemnt and its index number
        System.out.println("Enter the String input to search in the array ");
        String search = in.nextLine();

        // printing the retruned value of the method

        if (L_Search(arr, search) == -1)
            System.out.println("The search value is not available in the array ");
        else
            System.out.println(" The input value is found in the index number " + L_Search(arr, search));
    }

    public static String L_Search(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;

    }

}