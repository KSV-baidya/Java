// PROGRAM 161

//WAP to print the volume of cube and cuboid using menu driven program 
import java.util.Scanner;

public class volume_cube_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Volume of Cube");
            System.out.println("2. Volume of Cuboid");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the side length of the cube: ");
                    double side = sc.nextDouble();
                    double volumeCube = Math.pow(side, 3);
                    System.out.println("Volume of the cube: " + volumeCube);
                    break;
                case 2:
                    System.out.print("Enter the length of the cuboid: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the cuboid: ");
                    double width = sc.nextDouble();
                    System.out.print("Enter the height of the cuboid: ");
                    double height = sc.nextDouble();
                    double volumeCuboid = length * width * height;
                    System.out.println("Volume of the cuboid: " + volumeCuboid);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        System.exit(0);
    }
}