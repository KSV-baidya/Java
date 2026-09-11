package recurrsion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numebr of terms for the sum");
 int n = in.nextInt();
 System.out.println(sum(n));
    }//mains 
    
    static int sum (int n ){
        if ( n == 0)
            return 1;
        return ( n + sum(n-1));
    }
}
