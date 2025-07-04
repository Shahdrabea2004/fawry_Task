public class ShippableProdect extends Products implements Shippable{
    private float weight;
    public ShippableProdect(String name , float price , float quantity, float weight){
        super(name,price,quantity);
        this.weight=weight;
    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public float getWeight(){
        return weight;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
