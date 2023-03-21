package homeworkweek07;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */

import java.util.Scanner;

public class Prog_03MarkSheet {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Student ID: ");
        int id = scan.nextInt();
        calculator(name, id);//calling to main method
        scan.close();
    }

    public static void calculator(String name, int id) {

        Scanner sheet = new Scanner(System.in);

        System.out.print("Enter Maths Marks : ");
        int maths = sheet.nextInt();
        int maths1 = maths;
        if (maths < 0 || maths > 100) {
            System.out.println("Invalid Maths Marks ");
            System.out.print("Enter Valid Maths Marks : ");
            maths1 = sheet.nextInt();
        }

        System.out.print("Enter Science Marks : ");
        int science = sheet.nextInt();
        int science1 = science;
        if (science < 0 || science > 100) {
            System.out.println("Invalid Science Marks ");
            System.out.print("Enter Valid Science Marks : ");
            science = sheet.nextInt();
        }
        System.out.print("Enter English Marks : ");
        int english = sheet.nextInt();
        int english1 = english;
        if (english < 0 || english > 100) {
            System.out.println("Invalid English Marks ");
            System.out.print("Enter Valid English Marks : ");
            english = sheet.nextInt();
        }
        int sum = (maths1 + science1 + english1);
        int P = (sum * 100 / 300);

        String result = (maths > 35 || science > 35 || english > 35) ? "Pass" : "Fail";

        String grade;
        if (P >= 80) {
            grade = "A+";
        } else if (P >= 60 && P <= 79) {
            grade = "A";
        } else if (P >= 50 && P <= 59) {
            grade = "B";
        } else if (P >= 35 && P <= 49) {
            grade = "C";
        } else {
            grade = " ";
        }
        System.out.println("-----------------------------------------");
        System.out.println("|               Mark Sheet              |");
        System.out.println("|_______________________________________|");
        System.out.println("|   Name        :  " + name + "                   |");
        System.out.println("|   Roll No     :  " + id + "                   |");
        System.out.println("|_______________________________________|");
        System.out.println("|   Subject     :    Marks              |");
        System.out.println("|_______________________________________|");
        System.out.println("|   Maths       : " + maths1 + "                    |");
        System.out.println("|   Science     : " + science1 + "                    |");
        System.out.println("|   English     : " + english1 + "                   |");
        System.out.println("|_______________________________________|");
        System.out.println("|   Total       :  " + sum + "                  |");
        System.out.println("|_______________________________________|");
        System.out.println("|  Percentage   :  " + P + "                   |");
        System.out.println("|   Result      :  " + result + "                 |");
        System.out.println("|   Grade       :  " + grade + "                   |");
        System.out.println("|_______________________________________|");


    }

}
