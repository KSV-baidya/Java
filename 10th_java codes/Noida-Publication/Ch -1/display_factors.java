// PROGRAM 168 
//WAP to display the factors of the number 

import java.util.Scanner;

public class display_factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }// mains
     // TO FIND THE FACTORS OF A NUMBER AS PER THE QUESTION

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}