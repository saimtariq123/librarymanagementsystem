import java.io.Serializable;

public class Book implements Serializable  {
    public int bookID;
    String title;
    String author;
    String genre;
    boolean availability = true;
    public Book(int bookID, String title, String author, String genre,boolean availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = true; // Set initial availability, adjust if needed
    }
    public Book(){

    }
    @Override
    public String toString() {
        return bookID + "," + title + "," + author + "," + genre + "," + availability;
    }
   /*  Book(int bookID,String title,String author,String genre,String availability) {

        this.bookID=bookID;
        this.author=author;
        this.genre=genre;
        this.availability=availability;

    }*/
    
    /* void addBooks() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book ID: ");
        bookID = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter Title: ");
        title = input.nextLine();

        System.out.print("Enter Author: ");
        author = input.nextLine();

        System.out.print("Enter Genre: ");
        genre = input.nextLine();

        System.out.print("Enter Availability: ");
        availability = input.nextLine();
        input.close();
    }
    
    static Book[] addBooksToLibrary(int numberOfBooks) {
        Book[] books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            books[i] = new Book();
            books[i].addBooks();
        }

        return books;
    }
*/
    /*static void displayBookInformation(Book[] books) {
        System.out.println("Book Information:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Book ID: " + books[i].bookID);
            System.out.println("Title: " + books[i].title);
            System.out.println("Author: " + books[i].author);
            System.out.println("Genre: " + books[i].genre);
            System.out.println("Availability: " + books[i].availability);
            System.out.println();
        }
    }*/
    /*static void BooksbytitleOrauthor(Book[] books){
        Scanner input2 = new Scanner(System.in);
 
        System.out.println("Enter 1 for Title and 2 for Author: ");
        int option1= input2.nextInt();
        String title1= "0";
        String author1="0";
        do{
        switch(option1){
            case 1:
            System.out.println("Enter the title of book: ");
             title1= input2.nextLine();
            break;
            case 2:
            System.out.println("Enter the author of book: ");
             author1= input2.nextLine();
            break;
            default:
            System.out.println("Please enter the correct option:");
        }
    }while(option1!=1 || option1!=2);

        
        for (int i = 0; i < books.length; i++) {
            if(author1==books[i].author || title1==books[i].title){
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Book ID: " + books[i].bookID);
            System.out.println("Title: " + books[i].title);
            System.out.println("Author: " + books[i].author);
            System.out.println("Genre: " + books[i].genre);
            System.out.println("Availability: " + books[i].availability);
            System.out.println();
            
    }
    for (int j = 0; i < books.length; j++) {
        if(author1!=books[i].author || title1!=books[i].title){
        
        System.out.println("The title or author was not found. ");
        }
    } 
        input2.close();
    }
    
}*/
}