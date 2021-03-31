package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example_Hashset1 {
public static void main(String[] args) {
	String s1="abc";
	
	ArrayList al=new ArrayList();
	al.add("abc");
	al.add("xyz");
	al.add(50);
	al.add('A');
	al.add("abc");
	al.add("xyz");
	al.add(50);
	al.add('A');
	al.add("abc");
	al.add("xyz");
	al.add(50);
	al.add('A');
	al.add(s1);
	
	System.out.println(al);
	
	HashSet hs=new HashSet(al);
	System.out.println(hs);
	
	
}
}
