// PROGRAM 162

// SPECIAL NUMBER is a number whose sum of the factorial of its digits is equal to that of the number.

import java.util.Scanner;

public class Special_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            int prod = 1;
            for (int i = 1; i <= last; i++) {
                prod *= i;
            }
            sum += prod;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a special number.");
        } else {
            System.out.println(temp + " is not a special number.");
        }
    }
}
