package hwprogrammes;

/**
 * . Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */
public class Programme11_PrintTheNumbers {
        static int num;
        public static void main(String[] args) {
            div3();
            System.out.println(" ");
            div5();
        }
        // Static method using for loop finding number which can be divided by 3 between 0 to 100
        public static void div3() {
            for (num = 1; num <= 100; num++) {
                if (num % 3 == 0) {
                    System.out.print(num + ",");
                } else {
                }
            }
        }
        // Static method using for loop finding number which can be divided by 5 between 0 to 100
        public static void div5() {
            for (num = 1; num <= 100; num++) {
                if (num % 5 == 0) {
                    System.out.print(num + ",");
                } else {
                }
            }
        }
    }
