package hwprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_OddOrEven {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number
        System.out.println("Please insert a number: ");
        int a = input.nextInt();
        // Close the Scanner
        input.close();
        //if else condition to find the number either Even or Odd
        if (a % 2 == 0){
            System.out.println(a + " is an even number ");
        }else {
            System.out.println(a + " is an odd number ");
        }

    }
}
