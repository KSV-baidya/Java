package recurrsion;

import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner  (System.in);
        System.out.println("Enter the numebr of terms for the factorial");
 int n = in.nextInt();
 System.out.println(fact(n));
    }//mains 


    static int fact( int n ){
        if ( n == 0)
            return 1;
        return ( n *fact(n-1));
    }
}
