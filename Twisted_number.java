
//a twisted prime is a prime which when reversed is also a prime number. 
import java.util.Scanner;

public class Twisted_number {
    public static void main(String[] args) {
    

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the desired number to be checked ");
    int num = in.nextInt();
    // checking the number is prime or not
int fact = 0 ;
for(int i = 1;i<=num;i++)
    {
        if (num % i == 0) {
            fact++;
        }
    }if(fact==2)
    {
        System.out.println("The number is a prime number");
    }else
    {
        System.out.println("The number is not a prime number ");
        System.out.println(" The number cannot be checked for a twisted prime ");
        System.exit(0);
    }
    // reversing the number
    int rev = 0;
    while(num!=0)
    {
        int last = num % 10;
        rev = rev * 10 + last;
        num /= 10;
    }
    // checking the reversed number is prime or not
    int fact1 = 0;
    for( int i1 = 1;i1<=rev;i1++)
    {
        if (rev % i1 == 0) {
            fact1++;
        }
        if (fact1 == 2) {
            System.out.println("The reversed number is a prime number");
            System.out.println(" The number is a twisted prime number");
        } else {
            System.out.println("The reversed number is not a prime number ");
            System.out.println(" The number cannot be a twisted prime number ");
        }
    }
}
}
