package homeworkweek07;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Prog06OddOrEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//getting input
        System.out.print("Enter a number: ");

        int num = read.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
        read.close();//scanner close

    }
}
