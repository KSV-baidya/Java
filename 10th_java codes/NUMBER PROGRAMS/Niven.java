//a niven number is a number which is exactly divisible by the sum of its digits
import java.util.Scanner;
public class Niven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired number to be checked is niven or not ");  
        int n = in.nextInt();
        int sum = 0;
        int n1 = n;
        while ( n != 0){
            int last = n% 10; 
            sum += last ;
            n/=10;
        }
        if (n1 % sum == 0) {
            System.out.println("The number is a niven number");
        } else {
            System.out.println("The number is not a niven number");
        }
    }
}
