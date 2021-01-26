import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book = new Book("Tom, Dick and Harry",
                                "Uncle Jack",
                                "Geography");

    @Test
    public void bookHasTitle() {
        assertEquals("Tom, Dick and Harry", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Uncle Jack", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Geography", book.getGenre());
    }

}
