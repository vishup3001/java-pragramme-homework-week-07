package homeworkweek07;

import java.util.Locale;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Prog_08PrintCityName {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.println("Enter Any Alphabet from A to F :  ");
        String city = area.next();
        char cityname = city.toUpperCase().charAt(0);
        //Call to static method in main method
        cityName(cityname);
        area.close();

    }

    //Create Static Method.
    public static void cityName(char cityname) {
        //Declare if else method.
        if (cityname == 'A') {
            System.out.println("Amdavad");
        } else if (cityname == 'B') {
            System.out.println("Baroda");
        } else if (cityname == 'C') {
            System.out.println("Chani");
        } else if (cityname == 'D') {
            System.out.println("Dabhoi");
        } else if (cityname == 'E') {
            System.out.println("Eder");
        } else if (cityname == 'F') {
            System.out.println("Faridabad");
        } else
            System.out.println("Invalid Alphabet");
    }
}

