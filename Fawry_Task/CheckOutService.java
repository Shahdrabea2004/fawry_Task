import java.util.*;
public class CheckOutService {
    public static void checkout(Customer customer,Cart cart){
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty.");
        }


        List<CartItem> items = cart.getItems();
        for (CartItem item : items) {
            if (!item.getProducts().isAvailable(item.getQuantity())) {
                throw new IllegalStateException("Item " + item.getProducts().getName() + " is unavailable or expired.");
            }
        }

        double subtotal = cart.getSubtotal();
        double shipping = ShippingService.processShipping(cart.getShippableItems());
        double total = subtotal + shipping;

        if (!customer.hasSufficientBalance(total)) {
            throw new IllegalStateException("Insufficient balance.");
        }


        for (CartItem item : items) {
            item.getProducts().reduceQuantity(item.getQuantity());
        }
        customer.deductBalance(total);


        System.out.println("** Checkout receipt **");
        for (CartItem item : items) {
            System.out.println(item.getQuantity() + "x " + item.getProducts().getName() + " " + item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Amount " + total);
        System.out.println("Customer Balance After Payment: " + customer.getBalance());
    }
}
