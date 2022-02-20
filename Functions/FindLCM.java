import java.util.Scanner;

public class FindLCM {

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static int lcm(int x, int y) {
        int hcf = gcd(x, y);
        return (x * y) / hcf;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("LCM is: " + lcm(a, b));

    }

}
