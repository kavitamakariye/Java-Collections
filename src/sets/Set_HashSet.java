package sets;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>(); //Does not maintain sequence
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(9);
		hashSet.add(100);
		hashSet.add(65);
		hashSet.add(91);
		System.out.println(hashSet);
	}
}
