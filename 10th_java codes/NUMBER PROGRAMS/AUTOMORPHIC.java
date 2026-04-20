import java.util.Scanner;

public class AUTOMORPHIC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is an Automorphic number ");
        int n = in.nextInt();
        int square1 = n * n;
        int last = n % 10;
        int last1 = square1 % 10;
if ( last == last1) {
            System.out.println(n + " is an Automorphic number");
        } else {
            System.out.println(n + " is not an Automorphic number");
        }
    }
}
