import java.util.Scanner;

public class evevodd_with_boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd.");
        int x = in.nextInt();
        System.out.println(even_odd(x));
       
    }

    public static boolean even_odd(int x) {
        if (x % 2 == 0)
            return true;
        else
            return false;
    }
}
