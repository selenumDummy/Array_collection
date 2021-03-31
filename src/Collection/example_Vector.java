package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example_Vector {
public static void main(String[] args) {
	
	Vector V=new Vector();
	System.out.println(V.size());
	
	V.add("abc");
	V.add(100);
	V.add('A');
	V.add(79.5f);
	V.add("abc");
	V.add(100);
	V.add(null);
	V.add(null);
	
	System.out.println(V.capacity());
	
	System.out.println(V);  // []
	System.out.println(V.size()); //8
	
	System.out.println(V.isEmpty());// false
	System.out.println(V.contains(100));  // true
	System.out.println(V.get(1));   // 100
	System.out.println(V.get(6));
	
	System.out.println(V.indexOf('A'));  //2
	System.out.println(V.indexOf(100));
	System.out.println(V.lastIndexOf(100));  // 5
	
	
	//add/insert info in between vector--right shift operation
	System.out.println(V);
	V.add(2,'B');
	System.out.println(V);
	
	//remove/delete info in between vector--left shift operation
	V.remove(2);
	System.out.println(V);
	
	//update/modify
	V.set(3, 85.2f);
	System.out.println(V);
	
	System.out.println("----print vector info using iterator cursor--------");
	
	Iterator itr = V.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	System.out.println("----print vector info using listiterator cursor--------");
	
	ListIterator litr = V.listIterator();
	
	while (litr.hasNext()) {		
		System.out.println(litr.next());
	}
	
	
	System.out.println("----print vector info using for loop--------");

	for(int i=0; i<=V.size()-1; i++) {
		System.out.println(V.get(i));
	}
	
	System.out.println("----print vector info using foreach loop--------");

	for(Object str:V) {
		System.out.println(str);
	}
	
	
	System.out.println("----print vector info using enumeration cursor--------");

	Enumeration enu = V.elements();
	
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement());
	}
	
}
}
