import java.util.Scanner;

public class LibraryLateFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        double fine;
        if (days <= 5) fine = days * 1.0;
        else if (days <= 10) fine = days * 2.0;
        else fine = days * 5.0;

        System.out.println("Total Fine: $" + fine);

        // Print daily fine breakdown
        System.out.println("\nBreakdown:");
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + " → $" + (i <= 5 ? 1 : i <= 10 ? 2 : 5));
        }

        sc.close();
    }
}
