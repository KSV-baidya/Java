//LeetCode 1929

// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

// Example 1:

// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array limit ");
        int limit = in.nextInt();
        int[] arr = new int[limit];

        // input for array
        System.out.println("Enter the input of the elements of the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // Create concatenated array
        int[] result = new int[2 * limit];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i + limit] = arr[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }// mains

}