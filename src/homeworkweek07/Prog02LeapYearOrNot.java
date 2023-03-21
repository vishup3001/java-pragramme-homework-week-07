package homeworkweek07;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */


public class Prog02LeapYearOrNot {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//getting input

        System.out.print("input year : ");

        int year = in.nextInt();

        boolean x = (year % 4) == 0;

        boolean y = (year % 100) != 0;

        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        in.close();//scanner close
        // if else statement
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}