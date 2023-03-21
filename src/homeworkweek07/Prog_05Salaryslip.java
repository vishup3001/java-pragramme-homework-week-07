package homeworkweek07;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */
public class Prog_05Salaryslip {
    public static void main(String[] args) {
        //main method
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        int id = scan.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = scan.next();
        System.out.print("Enter Basic Salary : ");
        float basicSalary = scan.nextFloat();
        Prog_05Salaryslip obj = new Prog_05Salaryslip();//object create
        obj.salary(id, name, basicSalary);//calling to main method
        scan.close();
    }

    public void salary(int id, String name, float basicSalary) {
        float hra = (basicSalary * 10) / 100;
        float ta = (basicSalary * 8) / 100;
        float da = (basicSalary * 9) / 100;
        float pf = (basicSalary * 20) / 100;
        float gross = (basicSalary + hra + ta + da) - pf;
        System.out.println("-------------------------------");
        System.out.println("|       Salary Slip             |");
        System.out.println("|_______________________________|");
        System.out.println("|Emplyee Id   :  " + id + "              |");
        System.out.println("|Emplyee Name :  " + name + "          |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary :  " + basicSalary + "        |");
        System.out.println("|HRA 10%      :  " + hra + "         |");
        System.out.println("|TA 8%        :  " + ta + "          |");
        System.out.println("|DA 9%        :  " + da + "          |");
        System.out.println("|PF 20%       :  " + pf + "         |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary :  " + gross + "        |");
        System.out.println("|_______________________________|");
    }

}
