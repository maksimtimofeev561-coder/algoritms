import java.util.HashMap;

public class SimpleExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 15);
        for (String fruit : myMap.keySet()) {
            System.out.println(fruit + ": " + myMap.get(fruit));
        }
    }
}
