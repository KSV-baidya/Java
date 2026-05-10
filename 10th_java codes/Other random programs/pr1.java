
//Write a java program and take input fo 3 unequal numbers and print te second smallest number in the input of numbers
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = in.nextInt();
        System.out.println("Enter the second number ");
        int b = in.nextInt();
        System.out.println("Enter the third number ");
        int c = in.nextInt();
        // vhecking whether the three are unequal or not
        if (a == b || b == c || a == c) {
            System.out.println("Please enter three unequal numbers");
            System.exit(0);
        }
        int mid = 0;
        if (a > b && a < c || a < b && a > c) {
            mid = a;
        } else if (b > a && b < c || b < a && b > c) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.println("The second smallest number is " + mid);
    }
}