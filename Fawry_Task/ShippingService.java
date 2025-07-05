import java.util.*;
public class ShippingService {
    public static double processShipping(List<Shippable> items){
        double totalWeight = 0.0;

        // نخزن الاسم والعدد والوزن لكل وحدة
        Map<String, Integer> itemCount = new LinkedHashMap<>();
        Map<String, Double> unitWeights = new LinkedHashMap<>();

        System.out.println("** Shipment notice **");

        for (Shippable item : items) {
            String name = item.getName();  // الاسم فقط
            double weight = item.getWeight();  // وزن الوحدة

            itemCount.put(name, itemCount.getOrDefault(name, 0) + 1);
            unitWeights.put(name, weight);

            totalWeight += weight;
        }

        for (String name : itemCount.keySet()) {
            int count = itemCount.get(name);
            double unitWeight = unitWeights.get(name);
            double totalItemWeight = count * unitWeight;

            System.out.println(count + "x " + name + " " + (totalItemWeight * 1000) + "g");
        }

        System.out.println("Total package weight: " + totalWeight + " kg");
        return totalWeight * 30;
    }

}
