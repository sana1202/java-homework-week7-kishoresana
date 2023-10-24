package hwprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Programme20_ArraySpecificValue {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the value
        System.out.println("Please enter a value to check if it is stored in array: ");
        int toFind = input.nextInt();
        // Close the Scanner
        input.close();
        boolean found = false;

        for(int n : num){
            if (n == toFind){
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is stored in array ");
        }else {
            System.out.println(toFind + " is not stored in array ");
        }
    }
}
