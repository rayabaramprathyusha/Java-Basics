import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks  > 50) {
            System.out.println(name+" has passed");
        }else {
            System.out.println(name+" has not passed");
        }
        sc.close();
    }
}
