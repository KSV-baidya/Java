//LEETCODE#!

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Scanner;

public class Two_Sums {
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

        System.out.println("Enter the target that needed to be achieved");
        int target = in.nextInt();

        Two_Sums(arr, target);
    }// mains

    static void Two_Sums(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(" THe target is reached with index " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("The target value cannot be achieved within the array limit");

    }

}