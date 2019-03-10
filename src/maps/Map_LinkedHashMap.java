package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
		LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>();
		
		linkedHashMap1.put(12, "ffdg");
		linkedHashMap1.put(45, "sdfsa");
		System.out.println("LinkedHashMap1: "+linkedHashMap1);
		
		linkedHashMap2.put(78, "sf");
		linkedHashMap2.put(36, "daf");
		System.out.println("LinkedHashMap2: "+linkedHashMap2);
	}
}
