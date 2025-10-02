import java.util.Scanner;

public class StudentGradingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        char grade;
/*
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F'; */

        switch (marks/10) {
            case 10:
            case 9: grade='A'; break;
            case 8:
            case 7: grade='B'; break;
            case 6:
            case 5: grade='C'; break;
            default: grade='F';

        }

        System.out.print("Grade: "+grade);
        sc.close();


    }
}
