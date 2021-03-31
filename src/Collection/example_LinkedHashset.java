package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example_LinkedHashset {
public static void main(String[] args) {
	
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("abc");
	lhs.add(100);
	lhs.add('A');
	lhs.add("abc");
	lhs.add(100);
	lhs.add('A');
	lhs.add("abc");
	lhs.add(100);
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	System.out.println(lhs);
	System.out.println(lhs.isEmpty());  //false
	System.out.println(lhs.contains("xyz"));  //false
	lhs.remove(null);
	System.out.println(lhs);
	System.out.println(lhs.size());
	
	System.out.println("----print linkedhashset info using iterator-------");
	Iterator itr = lhs.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
