import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Reader> reader = new ArrayList<Reader>();
        ArrayList<LendingRegistry> registry = new ArrayList<LendingRegistry>();

        System.out.println("Please enter number for an option. Type 'Exit' to leave.");
        System.out.println("Option 1: Add a book;");
        System.out.println("Option 2: Return book and reader info;");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();

        while(option != "Exit")
        {
            if(option == "1") {
                System.out.println("Add a book!");
                ArrayList<Book> book1 = new ArrayList<Book>();
                System.out.println("Enter inventory number:");
                int addInvNumber = sc.nextInt();
                System.out.println("Enter author name:");
                String addAuthor = sc.nextLine();
                System.out.println("Enter book title:");
                String addTitle = sc.nextLine();
                System.out.println("Set price:");
                double addPrice = sc.nextDouble();
                Main.addBook(book1, addInvNumber, addAuthor, addTitle, addPrice);
            }
            if(option == "2") {
                ArrayList<Book> book2 = new ArrayList<Book>();
                infoBook(book2);
                ArrayList<Reader> reader1 = new ArrayList<Reader>();
                infoReader(reader1);
            }
            else{
                System.out.println("Incorrect input! Please try again.");
                break;
            }
        }
        System.out.println("Exiting program...");
    }

    public static void addBook(ArrayList<Book> book, int addInvNumber, String addAuthor, String addTitle, double addPrice){

        Book book1 = new Book(addInvNumber, addAuthor, addTitle, addPrice);
        book.add(book1);
    }

    public static ArrayList<Book> infoBook(ArrayList<Book> info)
    {
        ArrayList<Book> bookInfo = new ArrayList<Book>();
        for(Book i1 : bookInfo){
            System.out.println("[Inventory number = " + i1.getInvNumber() + ", " + "Author = " + i1.getAuthor() + ", " + "Title = " + i1.getTitle() + ", " + "Price =" + i1.getPrice() + "]");
        }
        return bookInfo;
    }

    public static ArrayList<Reader> infoReader(ArrayList<Reader> info){
        ArrayList<Reader> readerInfo = new ArrayList<Reader>();
        for(Reader i1 : readerInfo){
            System.out.println("[Name = " + i1.getName() + ", " + "Address = " + i1.getAddress() + ", " + "Social Number = " + i1.getSocialNumber() + "]");
        }
        return readerInfo;
    }
}