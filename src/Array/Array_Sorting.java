package Array;

import java.util.Arrays;

public class Array_Sorting {
	public static void main(String[] args) {

		String ar[] = { "mahesh", "ramesh", "suresh", "ganesh", "rahul" };

		System.out.println("----before sorting-----");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		System.out.println("----After sorting-----");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

	}
}
