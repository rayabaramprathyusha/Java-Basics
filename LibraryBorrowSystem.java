import java.util.Scanner;

public class LibraryBorrowSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books={"java\n", "Data Structures\n","OOP in Java\n","Advanced Algo\n"};
        boolean[] borrowed=new boolean[books.length];

        System.out.print("Welcome to Library Borrow System \n");
        System.out.print("Available Books \n");
        for(int i=0;i<books.length;i++)
        {
            System.out.print((i+1)+"."+books[i]+" ");
        }
        System.out.print("Enter Book number to Borrow: ");
        int choice=sc.nextInt();

        if (choice<1 || choice>books.length){
            System.out.println("Invalid Choice");
        }else {
            if (!borrowed[choice-1]){
                borrowed[choice-1]=true;
                System.out.println("You borrowed: "+books[choice-1]);
            }else{
                System.out.println("You already Borrowed: "+books[choice-1]);
            }
            sc.close();
        }
    }
}
