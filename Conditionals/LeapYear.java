
import java.util.Scanner;

public class LeapYear {

    public static void checkLeapOrNot(int y) {
        if ((y % 4 == 0 || y % 400 == 0) && (y % 100 != 0))
            System.out.println("A leap year!!");
        else
            System.out.println("Not a leap year");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int yr = scn.nextInt();
        checkLeapOrNot(yr);
    }

}