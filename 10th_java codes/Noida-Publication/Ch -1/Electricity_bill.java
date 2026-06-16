// #program -- 145 

/* An electricity board charges the bill depending on the number of units consumed as follows:

(i) First 100 units: 40 P per unit
(ii) Next 200 units: 60 P per unit
(iii) Above 300 units: 1 per unit phuo of

Write a Java program to print the net bill to be paid by a consumer. The net bill includes a rent of 250.00 charged from a consumer.
*/

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = in.nextInt();
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 0.40;
        } else if (units <= 300) {
            bill = (100 * 0.40) + ((units - 100) * 0.60);
        } else {
            bill = (100 * 0.40) + (200 * 0.60) + ((units - 300) * 1.00);
        }
        bill += 250.00; // Adding rent
        System.out.println("The net bill to be paid is: " + bill);
    }// mains
}
