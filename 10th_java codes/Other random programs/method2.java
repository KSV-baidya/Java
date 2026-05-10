//to find the addition with rerurn key word 

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER ");
        int x = in.nextInt();
        System.err.println("ENTER THE SECOND NUMBER ");
        int y = in.nextInt();
        if (ADDITION(x)==true) {
            System.out.println("vote");
        }
        else 
            System.out.println("no vote");
    }

    public static boolean ADDITION(int n) {
        if (n>18) {
            return true;
        }
        return false;
    }

}
