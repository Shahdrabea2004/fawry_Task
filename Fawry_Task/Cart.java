import java.util.*;
public class Cart {
    private List<CartItem> items =new ArrayList<>();
    public void add(Products products,int quantity)  {
        if(products.isAvailable(quantity)) {
            items.add(new CartItem(products,quantity));
        }
        else{
            throw new IllegalArgumentException("Product not available or expired.");
        }
    }
    public List<CartItem> getItems(){
        return items;
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }

    public double getSubtotal(){
        double total=0.0;
        for (CartItem item:items){
            total+=item.getTotalPrice();
        }
        return total;
    }

    public List<Shippable> getShippableItems(){
        List<Shippable> list=new ArrayList<>();
        for (CartItem item:items){
            if(item.isShippable()){
                for (int i=0;i<item.getQuantity();i++){
                    list.add((Shippable)item.getProducts());
                }
            }
        }
        return list;
    }

}
