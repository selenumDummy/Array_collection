package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class example_Hashset {
public static void main(String[] args) {
	
	HashSet hs =new HashSet();
	hs.add(50);
	hs.add("abc");
	hs.add('A');
	hs.add(50);
	hs.add(50);
	hs.add("abc");
	hs.add(null);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.isEmpty());  //false
	System.out.println(hs.contains(50));  // true
	hs.remove(50);
	System.out.println(hs);
	System.out.println(hs.size());
	
	System.out.println("-----print hashset info using iterator------");
	Iterator itr = hs.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("-----print hashset info using foreach loop------");

	for(Object str:hs) {
		System.out.println(str);
	}
	
	
}
}
