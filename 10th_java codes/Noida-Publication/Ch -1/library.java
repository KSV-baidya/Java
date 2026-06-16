// PROGRAM -- 155

/*
 * Design a class Library, define a method for the class that accepts the
 * memberId, memberName, bookName, and computes the fine for a member. The fine
 * is calculated depending on the number of days a book is returned late:
 * 
 * Days Fine per day in Rupees brose
 * First Ten days ₹1
 * Next Ten days   5
 * Later than 20 days ₹8
 * 
 */

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter member name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter number of days the book is late: ");
        int daysLate = scanner.nextInt();

        double fine = computeFine(memberId, memberName, bookName, daysLate);
        System.out.println("The fine for the late return is: ₹" + fine);
    }

    public static double computeFine(int memberId, String memberName, String bookName, int daysLate) {
        double fine = 0;
        if (daysLate <= 10) {
            fine = daysLate * 1;
        } else if (daysLate <= 20) {
            fine = 10 * 1 + (daysLate - 10) * 5;
        } else {
            fine = 10 * 1 + 10 * 5 + (daysLate - 20) * 8;
        }
        return fine;
    }
}