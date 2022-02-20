import java.util.Scanner;

public class FindGCD {

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("HCF is: " + gcd(a, b));

    }

}
