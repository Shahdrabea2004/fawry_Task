public class PaperBook extends Book{
   private int stock;


    public PaperBook(String isbn, String title,int year,double price,String author,int stock) {
        super(isbn,title,year,price,author);
        this.stock=stock;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Sending paper book to " + address);
    }

    public boolean reduceStock(int quantity){
        if(stock>=quantity){
            stock-=quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }
}
