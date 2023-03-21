package homeworkweek07;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Prog_10InputTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2, res;
        char ch;

        System.out.println("Enter any Two Numbers: ");
        num1 = scan.nextFloat();
        num2 = scan.nextFloat();
        System.out.println("Enter the Operator (+, -, *, /): ");
        ch = scan.next().charAt(0);
        if(ch == '+') res = num1 + num2;
        else if(ch == '-') res = num1 - num2;
        else if(ch == '*') res = num1 * num2;
        else if(ch == '/') res = num1 / num2;
        else
        {
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("\nResult = " + res);
        scan.close();
    }
}
