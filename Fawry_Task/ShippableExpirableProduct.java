import java.time.LocalDate;

public class ShippableExpirableProduct extends Products implements Shippable {
    private double weight;
    private LocalDate expiryDate;

    public ShippableExpirableProduct(String name, float price, float quantity, double weight, LocalDate expiryDate) {
        super(name, price, quantity);
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public double getWeight() {
        return weight;
    }



    @Override
    public String getName() {
        return super.getName() ;
    }

}
