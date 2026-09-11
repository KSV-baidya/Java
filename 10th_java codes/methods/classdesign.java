// Write a Java program to create a class classdesign with the following data members: name, age, mks, and stream.

// Create the following methods:

// accept() to accept the student's name, age, and marks.
// allocation() to allot a stream according to the marks:
// Marks ≥ 300 → Science and Computer
// Marks 200–299 → Commerce and Computer
// Marks 75–199 → Arts and Animation
// Marks 0–74 → Try again
// Any negative marks → Invalid statement
// print() to display the allotted stream.
// Create an object of the class in main() and call the methods in the appropriate order.

import java.util.Scanner;

//class declaration 
public class classdesign {
    //variables input globally 
  String name ;
  int age;
 double mks;
 String stream;


 //input for the variables 
  void accept(){
Scanner in = new Scanner(System.in);
name = in.nextLine();
age = in.nextInt();
mks = in.nextDouble();
 }

 //calculation for the stream selection
 void allocation(){
    if (mks>= 300) stream = "Scinece and Computer.";
    else if ( mks >= 200 && mks < 300)stream = "Commerce and Computer.";
    else if ( mks >= 75 && mks < 200) stream =("Arts and animation ");
    else if ( mks < 75 && mks >= 0) stream =("Try again ");
    else stream =("Invalid statement ");
 }

 //method for the printing 
 void print(){
System.out.println(stream);
 }
 
//main method 
public static void main(String[] args) {
    classdesign obj = new classdesign();
        obj.accept();
    obj.allocation();
    obj.print();
}//main
}