package homeworkweek07;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch) if
 *   any other alphabet should be invalid entry
 */

public class Prog_09SwitchStatement {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F : ");
        char ch = city.next().toUpperCase().charAt(0);
        //switch statement
        switch (ch) {
            case 'A':
                System.out.println("Amdavad");
                break;
            case 'B' :
                System.out.println("Baroda");
                break;
            case 'C' :
                System.out.println("Chani");
                break;
            case 'D' :
                System.out.println("Dabhoi");
                break;
            case 'E' :
                System.out.println("Eder");
                break;
            case 'F' :
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Alphabet");
                break;
        }
        city.close();//scanner close
    }
}
