package lesson16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> hm = new HashMap<>();
        hm.put("My toy", new Toy("Robot", 345.5));
        hm.put("This toy", new Toy("Termenator", 45.5));
        hm.put("Girls toy", new Toy("D", 3.5));
        hm.put("Bous toy", new Toy("Car", 5.5));
        iterrateByEmpty(hm);
        iterrateByKey(hm);
        iterrateByValue(hm);
    }

    public static void iterrateByEmpty(Map<String, Toy> hm) {
        Set<Map.Entry<String, Toy>> set = hm.entrySet();
        for (Map.Entry<String, Toy> map : set) {
            System.out.print(map.getKey() + ": ");
            System.out.println(map.getValue());
        }
    }

    public static void iterrateByKey(Map<String, Toy> hm) {
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " ");
            System.out.println(hm.get(key));
        }
    }

    public static void iterrateByValue(Map<String, Toy> hm) {
        Collection<Toy> value = hm.values();
        for (Toy toy : value) {
            System.out.println(toy);
        }
    }
}
