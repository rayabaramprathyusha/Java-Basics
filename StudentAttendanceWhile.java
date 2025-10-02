import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendanceWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> attendanceList = new ArrayList<>();

        System.out.print("Enter Student names for attendance(type done to finish the process): \n");
        String studentName="";
        while(!studentName.equalsIgnoreCase("done")){
            System.out.print("Enter Student Name: \n");
            studentName=sc.nextLine();

            if (!studentName.equalsIgnoreCase("done")){
                attendanceList.add(studentName);
            }

        }
        System.out.print("Attendance Recorded \n ");
        for (String name : attendanceList){
            System.out.println(" - "+name);
        }

        sc.close();
    }

}
