package library;

import java.util.List;
import java.util.Map;

public interface LibraryCatalog {
    void addAuthor(String author, List<String> books);
    List<String> getBooksByAuthor(String author);
    Map<String, List<String>> getAllAuthors();
    void printCatalog();
}
