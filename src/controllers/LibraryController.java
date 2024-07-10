package controllers;

import models.Book;
import models.Library;

public class LibraryController {

    private Library library = new Library();

    public void loadBooks(String resourceName) {
        /**TODO Step 2: read in book file from resources
         * NOTE: data in the CSV are in the following order:
         *       isbn, authors, publication year, title, average_rating
         */
        
        produceImportReport();
    }

    private void produceImportReport() {
        //TODO Step 3: Produce a report and write it to a file
        int[] ratingCounts = { 0, 0, 0, 0, 0};
        for (Book book : getBooks()) {
            int rating = Math.round(book.getRating());
            ratingCounts[rating - 1]++;
        }
    }

    private void addBook(Book book) {
        library.addBook(book);
    }

    public Book[] getBooks() {
        return library.getBooks();
    }

}
