import java.util.Scanner;

public class SI_CI_calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Simple Interest and 2 for Compound Interest.");

        int choose = in.nextInt();
        if (choose >= 3 || choose <= 0) {
            System.out.println(" Wrong input. ");
            choose = in.nextInt();
        }
        int n = 0;
        if (choose == 2) {
            System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO COMPOUND IT.....");
            System.out.println("Enter 1 for annually calculated. ");
            System.out.println("Enter 2 for half-yearly calculated. ");
            System.out.println("Enter 4 for quaterly calculated. ");

            // while (true) {
            // int n = in.nextInt();
            // if (n != 1 || n != 2 || n != 4) {
            // System.out.println("wrong input ");
            // n = in.nextInt();
            // } else {
            // break;
            // }
            // }

            while (true) {
                n = in.nextInt();
                if (n == 1 || n == 2 || n == 4) {
                    break; // valid input
                } else {
                    System.out.println("Invalid input. Try again:");
                }
            }

        }
        System.out.println("Enter the principal ");
        double p = in.nextDouble();
        System.out.println("Enter the rate of interest ");
        double r = in.nextDouble();
        System.out.println("Enter the number of years you want to calculate the Simple Interest ");
        double t = in.nextDouble();

        switch (choose) {
            case 1:
                SI(p, r, t);
                break;
            case 2:
                CI(p, r, t, n);
                break;
            default:
                System.out.println("WRONG INPUT ");
                break;
        }
    }

    // for simple interest calculation
    public static void SI(double p, double r, double t) {
        double Si = (p * t * r) / 100;

        // double amt = p + Si;
        System.out.println("The simple interest is " + Si);
        System.out.println("The Amount is " + (p + Si));

    }

    // for compound interest calculation
    public static void CI(double p, double r, double t, int n) {
      double amount= p;
    for (int i = 1; i <= t * n; i++) {
        amount = amount * (1 + (r / (100)));
    }

    double ci = amount - p;

    System.out.println("The compound interest is " + ci);
    System.out.println("The Amount is " + amount);
}

    }

