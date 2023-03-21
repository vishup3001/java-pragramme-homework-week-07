package homeworkweek07;

/**
 * . Write a Java program to sum values of an array
 */

public class Prog_18SumValuesOfArray {
    public static void main(String[] args) {
        int t[] = {45,89,75,63,79,20,63};
        int sum = 0; //declare sum
        for (int i : t)
        sum += i;
        System.out.println("sum of the number is " + sum);//concatination

    }
}
