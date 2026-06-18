import java.util.Scanner;

public class Main-Number-Codes
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // The result of which number that u want to show just pastethe function name
        // over here and it would be displayed
        amstrong(num);

    }// mains

    static void amstrong(int num) {

        int temp = num;
        int x = 0;
        while (num != 0) {
            num /= 10;
            x++;
        } // x is the number of digits
        num = temp;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum += (double) (Math.pow(last, x));
            num /= 10;
        }
        if (sum == temp)
            System.out.println("Yes it is an amstrong number ");
        else
            System.out.println("No it is not an amstrong number ");
    } // method1

}// class