import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library langsideLibrary;

    Book goodBadRubbish, flowers, cars, computers;

    // This method will be executed before each test case - to reset the data.
    @Before
    public void before() {
        langsideLibrary = new Library("Langside Library", 3);

        goodBadRubbish = new Book("The Good, The Bad and the Rubbish", "Steve The Bruce", "Sports");
        flowers = new Book("Blooming Bees", "Robert Gardener", "Botany");
        cars = new Book("Moving Fast", "Quick Hand Luke", "Automobiles");
        computers = new Book("Moving Faster", "R2D2", "Computers");


    }

    @Test
    public void libraryStartEmpty() {
        assertEquals(0, langsideLibrary.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        langsideLibrary.addBook(goodBadRubbish);
        assertEquals(1, langsideLibrary.countBooks());
    }

    @Test
    public void canAddBookToLibraryFalse() {

        // all of the following books should be added to the library.
        langsideLibrary.addBook(goodBadRubbish);
        langsideLibrary.addBook(flowers);
        langsideLibrary.addBook(cars);
        assertEquals(3, langsideLibrary.countBooks());

        // the next book should be be added to the library, as capacity is only 3.
        langsideLibrary.addBook(computers);
        assertEquals(3, langsideLibrary.countBooks());
    }

    @Test
    public void canTrackBooksByGenre() {

        langsideLibrary.setCapacity(15);

        // all of the following books should be added to the library.
        langsideLibrary.addBook(goodBadRubbish);

        langsideLibrary.addBook(flowers);
        langsideLibrary.addBook(flowers);

        langsideLibrary.addBook(cars);
        langsideLibrary.addBook(cars);
        langsideLibrary.addBook(cars);

        langsideLibrary.addBook(computers);
        langsideLibrary.addBook(computers);
        langsideLibrary.addBook(computers);
        langsideLibrary.addBook(computers);
        langsideLibrary.addBook(computers);

        // Create the genre tracker
        //langsideLibrary.sortBooksByGenre();

        assertEquals(1, langsideLibrary.getNoBooksForGenre("Sports"));
        assertEquals(2, langsideLibrary.getNoBooksForGenre("Botany"));
        assertEquals(5, langsideLibrary.getNoBooksForGenre("Computers"));

    }

}
