import java.util.Scanner;

public class Calculator {

    // main function
    public static void main(String[] args) {

        calc();

    }

    // calc function
    public static void calc() {

        char ch;
        do {
            // Input two variables
            int a, b;
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the digits:");
            System.out.print("a = ");
            a = scn.nextInt();
            System.out.println();
            System.out.print("b = ");
            b = scn.nextInt();
            System.out.println();

            // Displaying Menu
            dispMenu();

            // Selecting operator

            ch = scn.next().charAt(0);

            // Determining result
            perfOperation(a, b, ch);

            System.out.println("Want to calculate more?");
            ch = scn.next().charAt(0);

        } while ((ch == 'y') || (ch == 'Y'));

    }

    // dispMenu function
    public static void dispMenu() {
        System.out.println("Select an operator: ");
        System.out.println("1. + for Addition");
        System.out.println("2. - for Subtraction");
        System.out.println("3. * for Multiplication");
        System.out.println("4. / for Division");
        System.out.println("5. % for Modulus");
    }

    public static void perfOperation(int a, int b, char ch) {

        switch (ch) {
            case '+':
                System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
                break;

            case '-':
                System.out.println("The difference of " + a + " and " + b + " is: " + (a - b));
                break;

            case '*':
                System.out.println("The product of " + a + " and " + b + " is: " + a * b);
                break;

            case '/':
                if (b == 0)
                    System.out.println("Division not possible!!");
                else
                    System.out.println("The quotient when " + a + " divided by " + b + " is: " + (a / b));
                break;

            case '%':
                System.out.println("The remainder when " + a + " divided by " + b + " is: " + (a % b));
                break;

            default:
                System.out.println("Operator not defined!!");
        }
    }

}
