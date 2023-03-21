package homeworkweek07;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Prog_17SortArrayAndString {
    public static void main(String[] args) {

        int[] array1 = {2253, 1256, 7894, 5469, 0325, 4698, 0214, 7896, 6547, 6354, 7485, 9687};
        String[] array2 = {"Amdavad", "Baroda", "Vasad", "Dabhoi", "Vadaj", "Karjan", "Sinor", "Vadodara", "Halol", "Savali"};
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));
        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));

    }

}





