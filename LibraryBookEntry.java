import java.util.Scanner;

public class LibraryBookEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        displayBook(bookID,title,author);
        sc.close();
    }
    public static void displayBook(int bookID,String title,String author){
        System.out.println("Book ID: "+bookID+" Title: "+title+" Author: "+author);
    }
}