//prime and composite 

import java.util.Scanner;

public class TESTER {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int a = in.nextInt();
        PRIME_COMPOSITE(a);
    }

    public static void PRIME_COMPOSITE(int a) {
        int rem = 0;
        int temp = a;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                rem++;
        }
        if (rem == 2)
            System.out.println(temp + " is a prime number ");
        else if (rem > 2)
            System.out.println(temp + " is a composite number ");
        else
            System.out.println(temp + " is neither prime nor composite ");
    }

}