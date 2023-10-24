package hwprogrammes;

/**
 * Write a Java program to sum values of an array
 */
public class Programme18_SumValuesOfAnArray {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8 , 10, 12, 14}; //Array declaration
        int sum = 0; // assigning local variable
        for (int i : array) // for loop to take all the stored values and adding them
            sum += i;
        System.out.println(" The sum is " + sum);
    }
}
