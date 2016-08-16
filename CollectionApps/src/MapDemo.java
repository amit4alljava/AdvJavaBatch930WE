import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		/*
		 * List - Index Wise 
		 * Set - No Duplicate
		 * Map - Key and Value Pair
		 * Key can't be duplicate
		 */
		HashMap<String,Integer> phoneMap = new HashMap<>();
		phoneMap.put("amit",2222);  // add a new key
		phoneMap.put("ram", 3333);
		phoneMap.put("amit", 9999);
		System.out.println("PHONE MAP is "+phoneMap);  
		System.out.println(phoneMap.get("amit"));// access key value
		//phoneMap.remove("ram"); //remove by key
		// How to Traverse the Map
		Set<String> keys = phoneMap.keySet();  
		// Getting all the Keys and Keys are Unique
		// so Unique keys will store in Set (Unique)
		// and set has Iterator for Traversing
		// Now i am Iterating Keys one by one
		Iterator<String> keysIterator = keys.iterator();  // Getting Iterator from Set
		while(keysIterator.hasNext()){
			String key = keysIterator.next(); 
			// give the current key and move to the next key
			Integer value = phoneMap.get(key);
			System.out.println("Key is "+key +" and Value is "+value);
		}
		System.out.println("Now From Java 5 ");
		// Map is a Interface
		// and Map has a Inner Interface which is Entry
		for(Map.Entry<String, Integer> keyValuePair : phoneMap.entrySet()){
			System.out.println(keyValuePair.getKey()+" "+keyValuePair.getValue());
		}
		
		
		
		
	}

}
