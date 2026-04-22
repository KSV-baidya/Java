//to get the sum of the series S = 1/2 - 2/3 + 3/4 - 4/5 + 5/6 - 6/7 + .... n terms
import java.util.Scanner;
public class program2 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();
        double sum = 0.0;
        for ( int i =1; i<=n; i++){  // it stores the even nth term 
            if ( i %2  == 0 ){
                sum -=  (double) i / ( ( i+1 ));
            }
            else { // if i % 2 != 0 -- odd nth term 
                sum += (double) i / ( ( i+1 ));
            }   
        }
        System.out.println("The sum of the series is: " + sum);         
    }
}