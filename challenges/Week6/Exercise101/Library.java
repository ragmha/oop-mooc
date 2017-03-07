
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        return this.searchBook(title,null,-1);
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        return this.searchBook(null,publisher,-1);
    }

    public ArrayList<Book> searchByYear(int year){
        return this.searchBook(null,null,year);
    }

    public ArrayList<Book> searchBook(String title, String publisher, int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: this.books) {
            if(StringUtils.included(book.title(), title)
                    || StringUtils.included(book.publisher(), publisher)
                    || book.year() == year){
                found.add(book);
            }
        }

        return found;
    }

}
