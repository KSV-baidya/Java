// #LEETCODE -- 1672

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Example 1:
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.

import java.util.Scanner;

public class Richest_customer_wealth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // iitialisation of the 2D array
        System.out.println("Enter the number of customers u want to save the bank records for");
        int limit1 = in.nextInt();
        // System.out.println("Enter the maximum number of bank accounts one person has.
        // ");
        System.out.println(
    "Incase of those people who had less bank accounts than the maximum banks input, u can give the input 0.");
        int x = 1;
        int[][] arr = new int[limit1][x];

        // input of the 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of banks that person at index " + i + " has.");
            int limit2 = in.nextInt();
            for (int j = 0; j < limit2; j++) {
                arr[i][j] = in.nextInt();
                x++;
            }
        }

    }

}
