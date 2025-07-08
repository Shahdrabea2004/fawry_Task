public class EBook extends Book {

        private String filetype;


        public EBook(String isbn, String title, int year, double price, String author, String filetype) {
            super(isbn,title,year,price,author);
            this.filetype=filetype;
        }

        @Override
        public void deliver(String email, String address) {
            System.out.println("Quantum book store: Sending ebook to " + email);
        }




}
