package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_HashMap {

	public static void main(String[] args) {
		
		System.out.println("HashMap");
		Map<Integer, String> dictionary1 = new HashMap<>(); //Declaration of Hashmap as Map
		
		dictionary1.put(1, "abc");
		dictionary1.put(2, "xyz");
		dictionary1.put(3, "khs");
		dictionary1.put(4, "dgs");
		
		System.out.println(dictionary1);
		
		HashMap<Integer, String> dictionary2 = new HashMap<>();
		dictionary2.put(1, "as");
		dictionary2.put(2, "uio");
		dictionary2.put(3,"bnm");
		dictionary2.put(4, "yui");
		
		System.out.println("Dictionary1: "+dictionary2);
		System.out.println("KeySet: " +dictionary1.keySet());
		System.out.println("Remove index 3 from dictionary1: "+dictionary1.remove(3));
		System.out.println("Dictionary1: "+dictionary1);
		System.out.println("Dictionary2: "+dictionary2);
		dictionary2.put(5, "saad"); //Order of insertion is not maintained
		System.out.println("Dictionary2 changes: "+dictionary2);
		
		for(Entry<Integer, String> element: dictionary2.entrySet()) {
			System.out.println(element.getKey() + " ==> " + element.getValue());
		}
	}
}
