public class ShippableProdect extends Products implements Shippable{
    private double weight;
    public ShippableProdect(String name , float price , float quantity, double weight){
        super(name,price,quantity);
        this.weight=weight;
    }

    @Override
   public String getName() {
        return super.getName(); 
    }
    @Override
    public double getWeight(){
        return weight;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
