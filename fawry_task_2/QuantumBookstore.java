import java.util.*;
public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.getTitle());

    }

    public Book removeOutdateBook(int maxAge) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (String isbn : new ArrayList<>(inventory.keySet())) {
            Book book = inventory.get(isbn);
            if (currentYear - book.getYear() > maxAge) {
                inventory.remove(isbn);
                System.out.println("Quantum book store: Removed outdated book - " + book.getTitle());
                return book;
            }
        }
      return  null;
    }

    public double buyBook(String isbn, int qty, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) throw new RuntimeException("Book not found");

        if (book instanceof ShowcaseBook)
            throw new RuntimeException("This book is not for sale");

        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            if (!pb.reduceStock(qty))
                throw new RuntimeException("Not enough stock");
        }

        double totalPrice = book.getPrice() * qty;
        book.deliver(email, address);
        System.out.println("Quantum book store: Book purchased - " + book.getTitle());
        return totalPrice;
    }


}
