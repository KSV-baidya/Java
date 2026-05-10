import java.util.Scanner;

public class no_of_sums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO ADD THE INPUTS ");
        int num = in.nextInt();
        System.out.println(ADD(num));
    }

    public static int ADD(int num) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("ENTER THE DESIRED NUMBER ");
            int x = in.nextInt();
            sum = sum + x;
        }
        System.out.print("THE SUM OF THE VALUES INPUTED IS ");
        return sum;
    }
}
