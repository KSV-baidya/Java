
//Wap a program to accept names and total N number of students. print their avg total marks and deviation of each student(mark of the student - avg)
import java.util.Scanner;
import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int N = in.nextInt();
        String[] name = new String[N];
        int[] marks = new int[N];

        // input of the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the name of student " + i + 1);
            name[i] = in.nextLine();
            System.out.println("Enter the marks of that student ");
            marks[i] = in.nextInt();
        } // input complete

        // calculating total marks and average
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double avg = sum / N;

        // deriation of each student
        for (int i = 0; i < name.length; i++) {
            double r = (double) marks[i];
            double devia = r - avg;
            System.out.println("For student " + name[i] + ", the deviation is " + devia);
        }
    }

}