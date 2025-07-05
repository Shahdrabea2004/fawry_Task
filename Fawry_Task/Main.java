import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Products cheese = new ShippableExpirableProduct("Cheese", 100, 10, 0.4, LocalDate.now().plusDays(5));
        Products biscuits = new ShippableExpirableProduct("Biscuits", 150, 5, 0.7, LocalDate.now().plusDays(1));
        Products tv = new ShippableProdect("TV", 300, 3, 10.0);
        Products scratchCard = new NonExpirableProducts("ScratchCard", 50, 10);


        Customer customer = new Customer("Shahd", 3000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(tv, 3);
        cart.add(scratchCard, 1);

        CheckOutService.checkout(customer, cart);
    }
}
