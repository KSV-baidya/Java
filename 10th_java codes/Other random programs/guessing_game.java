import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = (int) (Math.random() * 100) + 1;
        // System.out.println("Computer guessed: " + guess);
        // guess ---- stores the guessed random digit.

        int x = 0;
        while (true) {
            System.out.println("ENTER THE DESIRED VALUE ");
            int a = in.nextInt();
            if (a == guess) {
                System.out.println("YES IT IS THE CORRECT VALUE ");
                x++;
                System.out.println("YOU GOT THE VALUE AFTER " + x + " CHANCES ");
                break;
            } else if (a > guess) {
                System.out.println("YOUR GUESSED VALUE IS GREATER  ");
                x++;
            } else if (a < guess) {
                System.out.println("YOUR GUESSED VALUE IS LESSER  ");
                x++;
            }
        }
        System.out.println("------THE GAME IS COMPLETED--------");
    }
}
