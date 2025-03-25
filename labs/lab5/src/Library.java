class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books;
    private int sizeOfBooks = 0;

    public Library() {}

    public Library(String name, String city, String country, int capacity) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = new Book[capacity];
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public void addBook(Book b) {
        if (sizeOfBooks < books.length) {
            books[sizeOfBooks++] = b;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void printLibraryData() {
        System.out.println("Library: " + name + ", City: " + city + ", Country: " + country);
        System.out.println("Books in Library:");
        for (int i = 0; i < sizeOfBooks; i++) {
            System.out.println(books[i].getBookData());
        }
    }
}