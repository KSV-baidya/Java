// program -- 154 
// to check whether the input is vowel or consonant from char input

import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        String str;
        int vCount = 0, cCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");

        }
    }
}
