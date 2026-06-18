// PROPRAM -- 164
// WAP to check a menu driven program to check (i) BUZZ NUMBER (ii) HCF

import java.util.Scanner;

public class Check_number_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Check Buzz Number");
            System.out.println("2. Check HCF");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int buzzNum = in.nextInt();
                    checkBuzzNumber(buzzNum);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int num1 = in.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = in.nextInt();
                    checkHCF(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 1 && choice != 2);
        System.exit(0);
    }// mains

    static void checkBuzzNumber(int num) {
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a Buzz Number.");
        } else {
            System.out.println(num + " is not a Buzz Number.");
        }
    }

    static void checkHCF(int num1, int num2) {
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
