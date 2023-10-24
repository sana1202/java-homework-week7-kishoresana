package hwprogrammes;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_PositiveOrNegativeOrZero {
    static int a;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the string
        System.out.println("Please enter the number : ");
        a = input.nextInt();
        // Close the Scanner
        input.close();
        determine();
    }
    public static void determine(){
        //if else condition to find the number either Positive, Negative or Zero
        if (a > 0){
            System.out.println(" The given number is of POSITIVE Value : ");
        }else if (a < 0){
            System.out.println(" The given number is of NEGATIVE Value : ");
        }else {
            System.out.println(" The given number is of ZERO Value : ");
        }
    }
}

