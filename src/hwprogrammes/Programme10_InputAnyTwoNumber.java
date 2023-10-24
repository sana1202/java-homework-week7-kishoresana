package hwprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_InputAnyTwoNumber {
        static int num1, num2;
        static char symbol;

        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.println("Please Enter First Number:");
            num1 = input.nextInt();
            System.out.println("Please Enter Second Number:");
            num2 = input.nextInt();
            System.out.println("Please Select The Calculation You Want To Perform by Entering +, -, *, /:");
            symbol = input.next().charAt(0);
            calculation();
            // Close the Scanner
            input.close();
        }
        // Static method taking the user inserted values and performing calculation accordingly displaying the result.
        public static void calculation() {
            if (symbol == '+') {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (symbol == '-') {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (symbol == '/') {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else if (symbol == '*') {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else {
                System.out.println(" Invalid Symbol Selected ");
            }
        }
    }
