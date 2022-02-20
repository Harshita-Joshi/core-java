import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class TriangleType {

    public static String findType(int a, int b, int c) {

        if (a == b && a == c)
            return "Equilateral";
        else if ((a == b) || (a == c) || (b == c))
            return "Isosceles";
        else
            return "Scalene";

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("The triangle is: " + findType(a, b, c));

    }

}
