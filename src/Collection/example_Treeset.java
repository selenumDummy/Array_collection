package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example_Treeset {
	public static void main(String[] args) {

		TreeSet tr = new TreeSet();
		tr.add(100);
		tr.add(50);
		tr.add(100);
		tr.add(50);
		tr.add(75);
		tr.add(150);
//	tr.add("abc");
		System.out.println(tr);
		// tr.add(null);

		tr.pollFirst();
		System.out.println(tr);

		tr.pollLast();
		System.out.println(tr);

		System.out.println(tr.first());
		System.out.println(tr.last());

		tr.add(60);
		tr.add(80);
		System.out.println("--ascending order--");
		Iterator itr = tr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--descending order--");

		Iterator itr1 = tr.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
