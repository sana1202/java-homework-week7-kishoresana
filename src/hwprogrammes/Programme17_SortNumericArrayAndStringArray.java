package hwprogrammes;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array
 */
public class Programme17_SortNumericArrayAndStringArray {
    public static void main(String[] args) {
        int[] array1 = { 150, 100, 350, 333, 555}; //Numeric Array declaration
        String[] array2 = { "Cucumber", "Agile", "SQL", "Postman", "Java"}; // String Array declaration
        //logic to sort arrays and printing them
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));

        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));
    }
}
