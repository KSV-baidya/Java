
// PRogram 146
/* 
Write a program that returns the commission in Rupees for a salesman.

The commission is based on the following conditions:

  Sales           Commission%

  < 5000          5%

  5000 to 10000   8%

  > 10000         10%
*/
import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = in.nextDouble();
        double commission;

        if (sales < 5000) {
            commission = sales * 0.05;
        } else if (sales >= 5000 && sales <= 10000) {
            commission = sales * 0.08;
        } else {
            commission = sales * 0.10;
        }

        System.out.println("The commission is: " + commission + " Rupees");
    }
}
