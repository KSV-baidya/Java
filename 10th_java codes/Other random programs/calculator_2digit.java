import java.util.Scanner;

public class calculator_2digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input of two numbers
        System.out.println("ENTER THE FIRST NUMBER ");
        int a = in.nextInt();
        System.out.println("ENTER THE SECOND NUMBER ");
        int b = in.nextInt();

        // writing the condition for the user to choose what to calculate
        System.out.println("Enter 1 for sum ");
        System.out.println("Enter 2 for substraction ");
        System.out.println("Enter 3 for multiplication ");
        System.out.println("Enter 4 for division ");
        System.out.println("Enter 5 for reminder ");
        int choose = in.nextInt();

        // checking whether choose is a valid input or not
        if (choose > 5 || choose <1) {
           System.out.println("entered an invalid input. Kindly re-enter ");
            choose = in.nextInt();
        } 

        // choosing what to calculate according to the choose data-type input
        switch (choose) {
            case 1:
                System.out.println("Calculating sum...");
                System.out.println(sum(a, b));
                break;
            case 2:
                System.out.println("Calculating substraction...");
                System.out.println(subs(a, b));
                break;
            case 3:
                System.out.println("Calculating multiplication...");
                System.out.println(mul(a, b));
                break;
            case 4:
                System.out.println("Calculating division...");
                System.out.println(div(a, b));
                break;
            case 5:
                System.out.println("Calculating reminder...");
                System.out.println(rem(a, b));
                break;
            default:
                System.out.println("INVALID ");
                break;
        }
    }

// writing the methods for the calculator 
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subs(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
       if (a==0 || b==0 ) {
        return 0;
       } 
       else {
        if (a > b) {
            a = a;
            b = b;
        } else {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return a / b;
    }
}

    public static int rem(int a, int b) {
       if (a==0 || b==0 ) {
        return 0;
       } 
       else {  
        if (a > b) {
            a = a;
            b = b;
        } else {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return a % b;
    }
    }
}
