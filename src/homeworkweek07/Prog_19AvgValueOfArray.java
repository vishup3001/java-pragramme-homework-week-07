package homeworkweek07;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Prog_19AvgValueOfArray {
    public static void main(String[] args) {
        int [] num=new int[] {25,55,78,96,45,36,54,73,-68,-74,-68};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i <num.length ; i++)
        sum = sum + num[i];
        //calculate average value
        double average = sum/num.length;
        System.out.println("Average value of array element is : " + average );

    }
}
