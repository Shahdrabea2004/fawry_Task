public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        store.addBook(new PaperBook("ISBN001", "Java Basics", 2018, 150.0, "John Smith", 10));
        store.addBook(new EBook("ISBN002", "Learn Python", 2022, 100.0, "Alice Doe", "PDF"));
        store.addBook(new ShowcaseBook("ISBN003", "Rare Book", 2000, 0.0,"Ancient Author"));

        store.removeOutdateBook(5);

        double amountPaid = store.buyBook("ISBN001", 2, "user@email.com", "123 Street");
        System.out.println("Quantum book store: Amount paid: " + amountPaid);

        store.buyBook("ISBN002", 1, "ebook@buyer.com", "No address needed");

    }
}
