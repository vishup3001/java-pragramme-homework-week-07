package homeworkweek07;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :
 */


public class Prog_01_OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();

        scan.close();

        //ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(number + " is " + result);

    }

}


