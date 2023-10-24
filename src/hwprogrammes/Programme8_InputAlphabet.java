package hwprogrammes;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8_InputAlphabet {
        static char l;

        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the number
            System.out.println("Please input any character from A to F (Uppercase Only):");
            l = input.next().charAt(0);
            // Close the Scanner
            input.close();
            Programme8_InputAlphabet obj = new Programme8_InputAlphabet();
            obj.city();
        }
        // Instance method with if else statement assessing the inserted character and printing city name
        // also ensuring inserted character is within permitted range
        public void city() {
            if (l == 'A') {
                System.out.println("Ahmedabad");
            } else if (l == 'B') {
                System.out.println("Bombay");
            } else if (l == 'C') {
                System.out.println("Calicut");
            } else if (l == 'D') {
                System.out.println("Dehradun");
            } else if (l == 'E') {
                System.out.println("Emod");
            } else if (l == 'F') {
                System.out.println("Fank");
            } else {
                System.out.println("Invalid Character Entry");
            }
        }
    }
