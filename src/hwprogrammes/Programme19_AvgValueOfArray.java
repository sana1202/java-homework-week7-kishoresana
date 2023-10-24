package hwprogrammes;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AvgValueOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 15, 20, 25, 30, 35}; // array declaration
        int total = 0;
        for (int i = 0; i < array.length; i++)
             total = total + array[i];
        double average = total /array.length; //Calculating average value
        System.out.println("Average value of the array elements is " + average);
    }
}
