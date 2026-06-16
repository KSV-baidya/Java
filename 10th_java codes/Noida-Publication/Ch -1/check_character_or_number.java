//PRogram -- 152 ----- GOOD QUESTION 

// WAP in Java to input a character from the keyboard and detect whether it is an alphabet or a digit. 
// If it is an alphabet, check whether it is a lowercase alphabet or an uppercase alphabet. 
// Print appropriate messages.

import java.util.Scanner;

public class check_character_or_number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase alphabet.");
            } else {
                System.out.println(ch + " is a lowercase alphabet.");
            }
        } else {
            System.out.println(ch + " is neither an alphabet nor a digit.");
        }

    }// mains
}