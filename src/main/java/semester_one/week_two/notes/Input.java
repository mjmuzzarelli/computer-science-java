package semester_one.week_two.notes;

import java.util.Scanner;

/**
 * Among other places, input can be accepted from: (a) the keyboard, and (b)
 * the JOptionPane.
 *
 * The {@link Scanner} class has many methods to accept and search for input
 * for a variety of data types, as well as methods to check if there is a
 * particular data type in the next input.
 */
public class Input {

    public static void main(String[] args) {
        // scanner object is created and is accepting input from the System
        Scanner keyboard = new Scanner(System.in);

        // print a question of what the user should input
        System.out.print("How many students are present today?");

        // scan the next token of input and return it as an integer
        int numberOfStudents = keyboard.nextInt();

        // print the value that was parsed to the numberOfStudents variable
        System.out.println("Number of students in class today is "
                + numberOfStudents + ".");

        // print another question of what the user should input
        System.out.print("What is the tax rate?");

        // scan the next token of input and return it as a double
        double taxRate = keyboard.nextDouble();

        // print the value that was parsed to the taxRate variable
        System.out.println("New tax rate is " + taxRate + ".");

        // print a question of what the user should input
        System.out.print("Is it raining? Reply with true/false.");

        // scan the next token of input and return it as a boolean
        boolean isRaining = keyboard.nextBoolean();

        // print the value that was parsed to the taxRate variable
        System.out.println("It is " + isRaining + " that it is raining.");
    }
}