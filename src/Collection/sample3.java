package Collection;

import java.util.ArrayList;

public class sample3 {
public static void main(String[] args) {
	
	int ar[]= {10,20,30,50,60};
	
	ArrayList al=new ArrayList();
	
	for(int i=0; i<=ar.length-1; i++) {
		int num = ar[i];
		al.add(num);
	}
	
	System.out.println(al.size());
	
}
}
