// #PROGRAM -- 140

// Write a menu driven program to convert celcius to fahrenheit and vice versa

import java.util.Scanner;

public class Celcius_to_fahrenheit_vice_versa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter 1 to convert Celcius to Fahrenheit");
        System.out.println("Enter 2 to convert Fahrenheit to Celcius");
        a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the temperature in Celcius: ");
                double c = in.nextDouble();
                System.out.println(convertCelciusToFahrenheit(c));
                break;
            case 2:
                System.out.println("Enter the temperature in Fahrenheit: ");
                double f = in.nextDouble();
                System.out.println(convertFahrenheitToCelcius(f));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }// mains

    static double convertCelciusToFahrenheit(double c) {
        double f = (c * 9 / 5) + 32;
        return f;
    }// method1

    static double convertFahrenheitToCelcius(double f) {
        double c = (f - 32) * 5 / 9;
        return c;
    }// method2
}