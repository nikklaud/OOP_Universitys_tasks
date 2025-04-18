package library;

import java.util.List;
import java.util.Map;

public class Library extends AbstractLibrary {
    private String libraryName;

    public Library(String libraryName) {
        super();
        this.libraryName = libraryName;
    }

    @Override
    public void printCatalog() {
        System.out.println("Library: " + libraryName);
        if (authorCatalog.isEmpty()) {
            System.out.println("No authors in catalog.");
        } else {
            for (Map.Entry<String, List<String>> entry : authorCatalog.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
