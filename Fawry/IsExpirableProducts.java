import java.time.LocalDate;
public class IsExpirableProducts extends Products{
    private LocalDate expiryDate;
    public IsExpirableProducts(String name, float price, float quantity,LocalDate expiryDate) {
        super(name, price, quantity);

        this.expiryDate=expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
