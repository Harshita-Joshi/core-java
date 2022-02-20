import java.util.Scanner;

public class LargestAndSmallest {

    public static int findLargest(int a, int b, int c) {

        int res = (a > b) ? a : b;
        res = (res > c) ? res : c;
        return res;
    }

    public static int findSmallest(int a, int b, int c) {

        int res = (a < b) ? a : b;
        res = (res < c) ? res : c;
        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("Largest is: " + findLargest(a, b, c));
        System.out.println("Smallest is: " + findSmallest(a, b, c));
    }

}
