public class Main {
    public static void main(String[] args) {
        User[] users = new User[15];

        users[0] = new User(1, "user1", "pass1", "Elizar", "Spasibochkin");
        users[1] = new User(2, "user2", "pass2", "Leha", "Moskowski");
        users[2] = new User(3, "user3", "pass3", "Abdurachman", "Legendov");
        users[3] = new User(4, "user4", "pass4", "Nikita", "Kolodec");
        users[4] = new User(5, "user5", "pass5", "Dora", "Dura");

        users[5] = new Staff(6, "staff1", "staffpass1", "Elizar", "Spasibochkin", 5000.0, new String[]{"Math", "Physics"});
        users[6] = new Staff(7, "staff2", "staffpass2", "Leha", "Moskowski", 5200.0, new String[]{"Chemistry", "Biology"});
        users[7] = new Staff(8, "staff3", "staffpass3", "Abdurachman", "Legendov", 4800.0, new String[]{"History"});
        users[8] = new Staff(9, "staff4", "staffpass4", "Nikita", "Kolodec", 5100.0, new String[]{"English", "Literature"});
        users[9] = new Staff(10, "staff5", "staffpass5", "Dora", "Dura", 4950.0, new String[]{"Geography"});

        users[10] = new Student(11, "stud1", "studpass1", "Elizar", "Spasibochkin", 3.8, new String[]{"Math", "Physics"});
        users[11] = new Student(12, "stud2", "studpass2", "Leha", "Moskowski", 3.5, new String[]{"Chemistry"});
        users[12] = new Student(13, "stud3", "studpass3", "Abdurachman", "Legendov", 3.9, new String[]{"Biology", "History"});
        users[13] = new Student(14, "stud4", "studpass4", "Nikita", "Kolodec", 3.7, new String[]{"English"});
        users[14] = new Student(15, "stud5", "studpass5", "Dora", "Dura", 4.0, new String[]{"Geography", "Literature"});

        for (User user : users) {
            System.out.println(user.getData());
        }

        Library library = new Library("Central Library", "Kaifork", "Abdurachmandia", 10);

        library.addBook(new ScientificBook("Physics Basics", "S001", 300, 500, "Springer"));
        library.addBook(new ScientificBook("Quantum Mechanics", "S002", 400, 700, "Cambridge Press"));
        library.addBook(new ScientificBook("Data Science", "S003", 350, 600, "O'Reilly"));
        library.addBook(new ScientificBook("Artificial Intelligence", "S004", 500, 900, "MIT Press"));
        library.addBook(new ScientificBook("Biotechnology", "S005", 450, 800, "Elsevier"));

        library.addBook(new LiteratureBook("Hamlet", "L001", 200, "William Shakespeare", 1603));
        library.addBook(new LiteratureBook("Pride and Prejudice", "L002", 250, "Jane Austen", 1813));
        library.addBook(new LiteratureBook("1984", "L003", 300, "George Orwell", 1949));
        library.addBook(new LiteratureBook("The Great Gatsby", "L004", 180, "F. Scott Fitzgerald", 1925));
        library.addBook(new LiteratureBook("Moby-Dick", "L005", 550, "Herman Melville", 1851));

        library.printLibraryData();
    }
}
