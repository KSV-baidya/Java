import java.util.Scanner;
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        //Calculating HCF
        int hcf = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        //Calculating LCM
        int lcm = (a * b) / hcf;
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
