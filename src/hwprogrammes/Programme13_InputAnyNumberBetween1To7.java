package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13_InputAnyNumberBetween1To7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number
        System.out.println(" Please enter any number from 1 to 7 : ");
        int day = input.nextInt();
        switch (day) { //Switch condition to find the Day of the week
            case 1:
                System.out.println(" Day 1 of the week is MONDAY");
                break;
            case 2:
                System.out.println(" Day 2 of the week is Tuesday");
                break;
            case 3:
                System.out.println(" Day 3 of the week is Wednesday");
                break;
            case 4:
                System.out.println(" Day 4 of the week is Thursday");
                break;
            case 5:
                System.out.println(" Day 5 of the week is Friday");
                break;
            case 6:
                System.out.println(" Day 6 of the week is Saturday");
                break;
            case 7:
                System.out.println(" Day 7 of the week is Sunday");
                break;
            default:
                System.out.println(" Week Contains 7 days only");
        }
        // Close the Scanner
        input.close();
    }
}
