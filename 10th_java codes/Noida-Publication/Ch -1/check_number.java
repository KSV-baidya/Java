// PROGRAM 163 

// WAP to check (i)prime number(ii)automorphic number using menu driven program 

import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Automorphic Number");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int primeNum = in.nextInt();
                    check_prime(primeNum);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int automorphicNum = in.nextInt();
                    check_automorphic(automorphicNum);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 1 || choice != 2);
        System.exit(0);
    }// mains

    static void check_prime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }// check_prime

    static void check_automorphic(int num) {
        int square = num * num;
        int temp = num;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(num + " is not an automorphic number.");
                return;
            }
            temp /= 10;
            square /= 10;
        }
        System.out.println(num + " is an automorphic number.");
    }// check_automorphic
}
