package hwprogrammes;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use Switch) if
 * any other alphabet should be invalid entry
 */
public class Programme9_SwitchStatement {
        static char l;
        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the details
            System.out.println("Please input any character from A to F (Uppercase Only): ");
            l = input.next().charAt(0);
            // Close the Scanner
            input.close();
            city();
        }
        // Static method assessing the inserted character and printing city name
        // also ensuring inserted character is within p
        public static void city() {
            switch (l) {
                case 'A':
                    System.out.println("Ahmedabad");
                    break;
                case 'B':
                    System.out.println("Bombay");
                    break;
                case 'C':
                    System.out.println("Calicut");
                case 'D':
                    System.out.println("Delhi");
                    break;
                case 'E':
                    System.out.println("Emod");
                    break;
                case 'F':
                    System.out.println("Fank");
                    break;
                default:
                    System.out.println("Invalid Character Entry");
            }
        }
    }
