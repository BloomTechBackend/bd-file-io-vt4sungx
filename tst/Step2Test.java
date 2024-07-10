import controllers.LibraryController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Step2Test {

    @Test
    public void testLibraryControllerLoadBooks() {
        LibraryController controller = new LibraryController();
        controller.loadBooks("bo" + "oks.csv");

        assertEquals(99, controller.getBooks().length);
    }

}
