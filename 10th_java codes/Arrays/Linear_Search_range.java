// LINEAR SEARCH IN A RANGE

import java.util.Scanner;

public class Linear_Search_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];

        // entry of the array lements
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // taking the input of the search elememt
        System.out.println("Enter the element that u want to search inside the array");
        int search = in.nextInt();

        // two kinds of range search
        // declare variables here
        int limit1 = 0;
        int start = 0;
        int end = 0;
        System.out.println("Enter 1 to search the element in a range from 0 ");
        System.out.println("Enter 2 to search the element in a range from one starting element to ending ");
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the range upto which u want to search the element starting from 0.");
                limit1 = in.nextInt();
                break;

            case 2:
                System.out.println("Enter the range upto which u want to search the element starting from: ");
                start = in.nextInt();
                System.out.println("And end upto: ");
                end = in.nextInt();
                break;

            default:
                System.out.println("INvalid input");
        }// switch case
        if (a == 1) {
            if (range1(arr, limit1, search) == -1)
                System.out.println("Not found!");
            else
                System.out.println("it is found in index " + range1(arr, limit1, search));
        } else if (a == 2) {
            if (range2(arr, start, end, search) == -1)
                System.out.println("Not found!");
            else
                System.out.println("it is found in index " + range2(arr, start, end, search));
        }
    }// mains

    // for a=1

    public static int range1(int[] arr, int limit1, int search) {
        for (int i = 0; i < limit1 + 1; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }// range1

    // for a=2
    public static int range2(int[] arr, int start, int end, int search) {
        for (int i = start - 1; i < end + 1; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }// range2

}// class