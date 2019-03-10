package lists;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> linkedList1 = new LinkedList<>(); // Parent to child
		LinkedList<String> linkedList2 = new LinkedList<>(); // child to child
		
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		linkedList1.add(4);
		
		System.out.println("LinkedList1: "+linkedList1);
		
		linkedList2.add("abc");
		linkedList2.add("xyz");
		linkedList2.add("pqr");
		linkedList2.add("rst");
		
		System.out.println("LinkedList2: "+linkedList2);
		System.out.println("Size of linkedlist1: "+linkedList1.size());
		linkedList1.removeAll(linkedList1);
		System.out.println(linkedList1);
	}
}
