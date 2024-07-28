
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Scanner;

// create a factorial calculator class
public class FactorialCalculator {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter a positive number
        System.out.print("Enter a positive integer: ");

        // scan for user input
        int intNumberInput = scanner.nextInt();

        // logic to check if input is valid for factorial ...
        if (intNumberInput < 0) {
            // if not, then alert the user
            System.out.println("Factorial is not defined for negative numbers.");
        // if input is valid, then ...
        } else {
            // calculate the factorial
            long lngFactorial = calculateFactorial(intNumberInput);
            // display the results to screen
            System.out.println("Factorial of " + intNumberInput + " is: " + lngFactorial + "\n\n\n");
        }

        // clear the memory
        scanner.close();
    }

    // logic to calculate factorial
    public static long calculateFactorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }

    }
}
