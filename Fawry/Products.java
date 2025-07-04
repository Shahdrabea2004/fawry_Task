public abstract class Products {
    private String name;
    private float price;
    private float quantity;

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public Products(String name , float price , float quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public abstract boolean isExpired();

  public boolean isAvailable(int requestQuantity){
    return quantity>=requestQuantity && !isExpired();
  }
  public void reduceQuantity(int amount){
      this.quantity-=amount;
  }


}
