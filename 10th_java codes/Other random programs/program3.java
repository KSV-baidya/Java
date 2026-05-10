//WAP to get the sum of the series : S = a/2 + a/3+ a/4 + a/5 + a/6 + a/7 + .... nth term 
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = in.nextInt();
        System.out.print("Enter the number of terms n: ");
        int n = in.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n ; i++) {
            sum += (double) a / (i+1);
        }
        System.out.println("The sum of the series is: " + sum); 
    }
}
