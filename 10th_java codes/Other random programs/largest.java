import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = in.nextInt();
        System.out.println("Enter the second number ");
        int b = in.nextInt();
        System.out.println("Enter the third number ");
        int c = in.nextInt();
        System.out.println("The largest of three numbers is " + large(a, b, c));

    }

    public static int large(int a, int b, int c) {
        int x = a > b ? (a > c ? a : c) : (b > c ? b : c);
        return x;
    }
}
