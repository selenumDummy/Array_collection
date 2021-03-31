package Collection;

import java.util.ArrayList;

public class sample2
{
public static void main(String[] args) {
	
	
	ArrayList al=new ArrayList();
	
	int[] ar1 = sample1.getdata();
	
	
	for(int i=0; i<=ar1.length-1; i++) {
		al.add(ar1[i]);
	}
	
	System.out.println(al.size());
	System.out.println(al);
	
}
}
