package hwprogrammes;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Programme12_InputValueIsAlphabetOrSymbol {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the User
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter any value
        System.out.println(" Please Enter any value : ");
        char ch = input.next().charAt(0);
        // Using character class combined with Nested If Else to determine inserted value is Alphabet, Number or Symbol
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + "is an Alphabet ");
        }else if (Character.isDigit(ch)){
            System.out.println(ch + " is a Number ");
        }else {
            System.out.println(ch + " is a Symbol ");
        }
        // Close the Scanner
        input.close();
    }
}
