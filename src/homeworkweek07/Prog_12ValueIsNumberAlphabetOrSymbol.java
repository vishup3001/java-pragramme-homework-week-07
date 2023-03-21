package homeworkweek07;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Prog_12ValueIsNumberAlphabetOrSymbol {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) {
            System.out.println(ch + " is ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");
        } else {
            System.out.println(ch + "is A SPECIAL CHARACTER.");
            sc.close();
        }
    }
}




