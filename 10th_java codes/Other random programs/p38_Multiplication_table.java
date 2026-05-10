import java.util.Scanner;

public class p38_Multiplication_table {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            mul_table(3,2);
        }
        // // System.out.println("hello world");
        // System.out.println();
        // mul_table(7,4);
        // System.out.println();
        // mul_table(9,6);
    }
    public static void mul_table(int n,int c){
        for (int i = 1; i <= c; i++) {
            System.out.println(n+ " X "+i+" = "+(n*i));
        }
    }
}
