public class ShowcaseBook extends Book{
    public ShowcaseBook(String isbn, String title,int year,double price,String author) {
        super(isbn,title,year,0.0,author);

    }
    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: This book is not for sale.");
    }
}
