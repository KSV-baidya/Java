//   a harshad number is a number which is exactly divisible by the sum of its digits
//  IT IS THE SAME AS NIVEN NUMBER
import java.util.Scanner;
public class Harshad_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired number to be checked is harshad or not ");  
        int n = in.nextInt();
        int sum = 0;
        int n1 = n;
        while ( n != 0){
            int last = n% 10; 
            sum += last ;
            n/=10;
        }
        if (n1 % sum == 0) {
            System.out.println("The number is a harshad number");
        } else {
            System.out.println("The number is not a harshad number");
        }
    }
}
