package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("abc");
		linkedHashSet.add("xyx");
		linkedHashSet.add("pqr");
		System.out.println(linkedHashSet);
	}
}
