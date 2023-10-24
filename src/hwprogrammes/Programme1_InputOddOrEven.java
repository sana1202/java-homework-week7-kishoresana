package hwprogrammes;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme1_InputOddOrEven {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number
        System.out.println(" Enter a number : ");
        int num = input.nextInt();
        // Close the Scanner
        input.close();
        String result = (num % 2 == 0) ? " Even " : " Odd ";
        System.out.println(" the input number is " + result);

    }
}
