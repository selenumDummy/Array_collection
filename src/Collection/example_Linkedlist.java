package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example_Linkedlist {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		System.out.println(ll.size());

		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add(79.5f);
		ll.add("abc");
		ll.add(100);
		ll.add(null);
		ll.add(null);

		System.out.println(ll); // []
		System.out.println(ll.size()); // 4

		System.out.println(ll.isEmpty());// false
		System.out.println(ll.contains(100)); // true
		System.out.println(ll.get(1)); // 100
		System.out.println(ll.get(6));

		System.out.println(ll.indexOf('A')); // 2
		System.out.println(ll.indexOf(100));
		System.out.println(ll.lastIndexOf(100)); // 5

		// add/insert info in between linkedlist
		System.out.println(ll);
		ll.add(2, 'B');
		System.out.println(ll);

		// remove/delete info in between arraylist
		ll.remove(2);
		System.out.println(ll);

		// update/modify
		ll.set(3, 85.2f);
		System.out.println(ll);

		System.out.println("----print arraylist info using iterator cursor--------");

		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----print arraylist info using listiterator cursor--------");

		ListIterator litr = ll.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("----print arraylist info using for loop--------");

		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("----print arraylist info using foreach loop--------");

		for (Object str : ll) {
			System.out.println(str);
		}
		
		ArrayList al=new ArrayList(ll);
		System.out.println("size of Arraylist: "+al.size());
		
		ll.clear();
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());

		
		
		
	}
}
