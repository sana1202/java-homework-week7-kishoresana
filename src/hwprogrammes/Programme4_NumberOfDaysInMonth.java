package hwprogrammes;

import java.util.Scanner;

public class Programme4_NumberOfDaysInMonth {
        static int month;
        static int year;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Insert Year:");
            int year = scan.nextInt();
            if (year >= 1 && year <= 9999) {
                isLeapYear(year);
                getDaysInMonth(month, year);
            } else {
                System.out.println("false");
            }
            scan.close();
        }
        // Static method counting whether inserted year is leap year or not
        public static void isLeapYear(int year) {
            if (year != 0) {
                if (year % 400 == 0)
                    System.out.println("true");
                else if (year % 100 == 0)
                    System.out.println("true");
                else if (year % 4 == 0)
                    System.out.println("true");
                else
                    System.out.println("false");
            } else
                System.out.println("false");
        }
        // Static method asking user to enter month and assessing how many days should be displayed
        public static void getDaysInMonth(int month, int year) {
            Scanner input = new Scanner(System.in);
            int days = 0;
            System.out.print("Please Insert Month: ");
            month = input.nextInt();
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                default:
                    days = -1;
            }
            System.out.print(days);
            input.close();
        }
    }
