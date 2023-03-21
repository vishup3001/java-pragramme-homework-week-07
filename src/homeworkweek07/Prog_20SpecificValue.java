package homeworkweek07;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Prog_20SpecificValue {
    public static void main(String[] args) {
        int[] num = {11, 25, 45, 78, 69};
        int toFind = 25;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}


