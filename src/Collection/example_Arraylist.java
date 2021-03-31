package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example_Arraylist {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList(50);
	System.out.println(al.size());
	
	al.add("abc");
	al.add(100);
	al.add('A');
	al.add(79.5f);
	al.add("abc");
	al.add(100);
	al.add(null);
	al.add(null);
	
	
	System.out.println(al);  // []
	System.out.println(al.size()); //4
	
	System.out.println(al.isEmpty());// false
	System.out.println(al.contains(100));  // true
	System.out.println(al.get(1));   // 100
	System.out.println(al.get(6));
	
	System.out.println(al.indexOf('A'));  //2
	System.out.println(al.indexOf(100));
	System.out.println(al.lastIndexOf(100));  // 5
	
	
	//add/insert info in between arraylist--right shift operation
	System.out.println(al);
	al.add(2,'B');
	System.out.println(al);
	
	//remove/delete info in between arraylist--left shift operation
	al.remove(2);
	System.out.println(al);
	
	//update/modify
	al.set(3, 85.2f);
	System.out.println(al);
	
	System.out.println("----print arraylist info using iterator cursor--------");
	
	Iterator itr = al.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	System.out.println("----print arraylist info using listiterator cursor--------");
	
	ListIterator litr = al.listIterator();
	
	while (litr.hasNext()) {		
		System.out.println(litr.next());
	}
	
	
	System.out.println("----print arraylist info using for loop--------");

	for(int i=0; i<=al.size()-1; i++) {
		System.out.println(al.get(i));
	}
	
	System.out.println("----print arraylist info using foreach loop--------");

	for(Object str:al) {
		System.out.println(str);
	}
	
	
}
}
