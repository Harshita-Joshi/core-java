
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DeterQuadrant {

    public static int findQuad(int x, int y) {

        if (x >= 0 && y >= 0)
            return 1;
        else if (x < 0 && y >= 0)
            return 2;
        else if (x < 0 && y <= 0)
            return 3;
        else
            return 4;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x and y coords: ");
        int x = scn.nextInt();
        int y = scn.nextInt();

        System.out.println("(" + x + "," + y + ") lies in quadrant " + findQuad(x, y));

    }

}
