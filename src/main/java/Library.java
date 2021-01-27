import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> booksByGenre;


    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        this.books = new ArrayList<>();

        // The HashMap will hold the genre, and the number of books for that genre
        this.booksByGenre = new HashMap<String, Integer>();

    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int countBooks() {
        return books.size();
    }


    public void addBook(Book book) {
        if (getCapacity() > countBooks()) {
            books.add(book);
            addGenreCount(book); // update the appropriate books by genre count
        }
    }

    // Replaced the following code with different logic - but keeping (commented) in
    // for future reference!
//    public void sortBooksByGenre() {
//        for (Book book : books) {
//            if (booksByGenre.containsKey(book.getGenre())) {
//                booksByGenre.put(book.getGenre(), booksByGenre.get(book.getGenre()) + 1);
//            } else {
//                booksByGenre.put(book.getGenre(), 1);
//            }
//        }
//    }

    private void addGenreCount(Book book) {
        if (booksByGenre.containsKey(book.getGenre())) {
            booksByGenre.put(book.getGenre(), booksByGenre.get(book.getGenre()) + 1);
        } else {
            booksByGenre.put(book.getGenre(), 1);
        }

    }

    public int getNoBooksForGenre(String genre) {
        return booksByGenre.get(genre);
    }

}
