package library;

import java.util.*;

public abstract class AbstractLibrary implements LibraryCatalog {
    protected TreeMap<String, List<String>> authorCatalog;

    public AbstractLibrary() {
        this.authorCatalog = new TreeMap<>();
    }

    @Override
    public void addAuthor(String author, List<String> books) {
        authorCatalog.put(author, new ArrayList<>(books));
    }

    @Override
    public List<String> getBooksByAuthor(String author) {
        if (authorCatalog.containsKey(author)) {
            return new ArrayList<>(authorCatalog.get(author));
        }
        return new ArrayList<>();
    }

    @Override
    public Map<String, List<String>> getAllAuthors() {
        return new TreeMap<>(authorCatalog);
    }
}
