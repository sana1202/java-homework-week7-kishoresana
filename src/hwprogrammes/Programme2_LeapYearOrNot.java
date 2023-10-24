package hwprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2_LeapYearOrNot {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the Year
        System.out.println(" Enter a Year: ");
        int year = input.nextInt();
        // Close the Scanner
        input.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println( " This is a leap year : " + year);
        }else {
            System.out.println(" This is not leap year: " + year);
        }
    }
}
