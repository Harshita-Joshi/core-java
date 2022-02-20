import java.util.Scanner;

public class MNDependency {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m = scn.nextInt();
        int n;
        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        System.out.println(n);
    }
}
