class Book {
    private String name;
    private String code;
    private int pages;

    public Book() {}

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public String getBookData() {
        return "Name: " + name + ", Code: " + code + ", Pages: " + pages;
    }
}