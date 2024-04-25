package in.ineuron;
import java.util.*;
public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

      
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");

        
        searchAndPrint(hashMap, "key2");
        searchAndPrint(hashMap, "key5"); 
    }


    public static void searchAndPrint(HashMap<String, String> hashMap, String key) {
 
        if (hashMap.containsKey(key)) {

            String value = hashMap.get(key);
            System.out.println("Value for key '" + key + "': " + value);
        } else {
        
            System.out.println("Key '" + key + "' not found in the HashMap.");
        }
    }
}
