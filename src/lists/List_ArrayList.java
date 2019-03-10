package lists;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> intArrayList1 =  new ArrayList<>();	//Parent to child
		ArrayList<Integer> intArrayList2 = new ArrayList<>();	//child to child
		
		intArrayList1.add(1);
		intArrayList1.add(2);
		intArrayList1.add(3);
		intArrayList1.add(4);
		
		System.out.println("ArrayList1: "+intArrayList1);
		System.out.println("Getting the value at specific indext: "+intArrayList1.get(2));
		System.out.println("Size of ArrayList: "+intArrayList1.size());
		System.out.println("Checking the occurence of an integer: "+intArrayList1.contains(123));
		intArrayList2.addAll(intArrayList1);
		System.out.println("ArrayList2: "+intArrayList2);
		intArrayList1.removeAll(intArrayList1);
	}
}
