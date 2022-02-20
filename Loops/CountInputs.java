import java.util.Scanner;

public class CountInputs {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            String input = scn.next();
            if (input.equals("q"))
                break;
            else
                cnt++;
        }

        System.out.println(cnt);
    }

}
