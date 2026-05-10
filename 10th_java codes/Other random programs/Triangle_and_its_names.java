
//Check whether a triangle is possible or not from three inout angles and state whether it is acute,obtuse or right angled triangle
import java.util.Scanner;

public class Triangle_and_its_names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = in.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b = in.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c = in.nextInt();
        // checkimg whether triangle formation is posible or not
        if (a > 0 && a < 180 && b > 0 && b < 180 && c > 0 && c < 180 && a + b + c == 180) {
            System.out.println("Triangle formation is possible with the given angles");
            // checking the triangle is whether is acute, right or obtuse angle
            if (a < 90 && b < 90 && c < 90) {
                System.out.println("The triangle is an acute angled triangle");
            } else if (a == 90 || b == 90 || c == 90) {
                System.out.println("The triangle is a right angled triangle");
            }
            // else if (a>90 || b>90 || c>90) --- talking about obtuse angled triangle
            else {
                System.out.println("The triangle is an obtuse angled triangle");
            }
        } else {
            System.out.println("Triangle formation is not possible with the given angles");
        }
    }
}
