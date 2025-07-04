import java.util.*;
public class ShippingService {
    public static double processShipping(List<Shippable> items){
        double totalWeight=0.0;
        Map<String,Integer> itemCount=new HashMap<>();
        System.out.println("** Shipment notice **");
        for(Shippable item:items){
            totalWeight+=item.getWeight();
            String name= item.getName();
            if (itemCount.containsKey(name)) {
                int currentCount = itemCount.get(name);
                itemCount.put(name, currentCount + 1);
            } else {
                itemCount.put(name, 1);
            }
        }

        for (String name : itemCount.keySet()) {
            int count = itemCount.get(name);
            System.out.println(count + "x " + name);
        }

        System.out.println("Total package weight: " + totalWeight + " kg");
        double shippingCost=totalWeight*30;
        return shippingCost;
    }
}
