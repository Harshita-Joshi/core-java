import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class StudentMarksGrade {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks in Physics, Chem and Maths: ");
        // int p = scn.nextInt();
        // int c = scn.nextInt();
        // int m = scn.nextInt();

        int totalMarks = 0;
        totalMarks += scn.nextInt();
        totalMarks += scn.nextInt();
        totalMarks += scn.nextInt();
        char grade;
        int avg = totalMarks / 3;
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Marks in total = " + totalMarks);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }

}
