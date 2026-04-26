import java.util.Scanner;

//The pronic number is the number which is the product of two consecutive integers 
public class pronic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the pronic number ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) == n) {
                System.out.println("Yes the pronic number of the input is " + i + "*" + (i + 1));
                break;
            } else
                System.out.println("The input doesnt have any pronic number");
        }
    }
}
