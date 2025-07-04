
public class CartItem {
    private Products products;
    private int quantity;

    public CartItem(Products products,int quantity){
        this.products=products;
        this.quantity=quantity;
    }

    public Products getProducts() {
        return products;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice(){
        return products.getPrice()*quantity;
    }
    public boolean isShippable() {
        return products instanceof Shippable;
    }
}
