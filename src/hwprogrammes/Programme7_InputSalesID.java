package hwprogrammes;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7_InputSalesID {
        static int salesID, salesAmount, basicSalary;
        static String name;

        public static void main(String[] args) {
            // Create a Scanner object to read input from the User
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the details
            System.out.println("Please enter Sales ID:");
            salesID = input.nextInt();
            System.out.println("Please enter Seller's Name:");
            name = input.next();
            System.out.println("Please enter Sales Amount:");
            salesAmount = input.nextInt();
            System.out.println("Please enter Basic Salary:");
            basicSalary = input.nextInt();
            // Close the Scanner
            input.close();
            calculation();
        }
        // Static method with Nested if else calculating the sales commission depending on condition specified.
        public static void calculation() {
            float commission;
            if (salesAmount >= 50000) {
                commission = (salesAmount * 35) / 100;
            } else if (salesAmount >= 30000) {
                commission = (salesAmount * 20) / 100;
            } else if (salesAmount >= 20000) {
                commission = (salesAmount * 10) / 100;
            } else if (salesAmount >= 10000) {
                commission = (salesAmount * 5) / 100;
            } else {
                commission = (salesAmount * 2) / 100;
            }
            System.out.println("The Commission based on entered value is: " + commission);
        }
    }
