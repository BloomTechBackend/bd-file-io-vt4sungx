import controllers.LibraryController;

public class App {

    public static void main(String[] args) {

        LibraryController library = new LibraryController();
        library.loadBooks("b"+"ooks.csv");

    }
}
