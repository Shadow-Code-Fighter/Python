import java.util.Arrays;

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class LibraryManagementSystem {
    private String[] books;

    public LibraryManagementSystem(String[] books) {
        this.books = books;
    }

    public void findBook(String book) throws BookNotFoundException {
        if (Arrays.asList(books).contains(book)) {
            System.out.println(book);
        } else {
            throw new BookNotFoundException("Book not found in library");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] books = { "Internet and Java Programming", "Artificial Intelligence and ES", "Information security",
                "Compiler Design" };
        LibraryManagementSystem library = new LibraryManagementSystem(books);
        try {
            library.findBook("The Great Gatsby");
            library.findBook("Moby Dick");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
