//LEETCODE 1480. Running Sum of 1d Array

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.Scanner;

public class Running_1darray_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array limit ");
        int limit = in.nextInt();
        int[] arr = new int[limit];
        int[] runningSum = new int[limit];

        // input for array
        System.out.println("Enter the input of the elements of the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        running_sum(arr, runningSum);
    }// mains

    static void running_sum(int[] arr, int[] runningSum) {
        for (int i = 0; i < runningSum.length; i++) {
            // while loop is for each index of the running sum array
            int x = 0;
            int sum = 0;
            while (x <= i) {
                sum += arr[x];
                x++;
            }
            runningSum[i] = sum;
        }
        for (int i = 0; i < runningSum.length; i++) {
            System.out.print(runningSum[i] + ", ");
        }
    }// function
}