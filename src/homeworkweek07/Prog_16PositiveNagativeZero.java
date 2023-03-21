package homeworkweek07;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */


public class Prog_16PositiveNagativeZero {
    public static void main(String[] args) {
        int num;
        // object of the scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // Reading a number from user
        num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else if(num<0){
            System.out.println("Number is nagative");
        }
        //executes when above two condition return false
        else{
            System.out.println("Number is zero");
            sc.close();
        }
    }
}
