public class NonExpirableProducts extends Products{
    public NonExpirableProducts(String name, float price, float quantity) {
        super(name, price, quantity);

    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
