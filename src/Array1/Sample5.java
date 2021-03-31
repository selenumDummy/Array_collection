package Array1;

import java.util.Arrays;

public class Sample5 {
	public static void main(String[] args) {

		int ar[] = new int[5];
		ar[0] = 20;
		ar[1] = 30;
		ar[2] = 40;
		ar[3] = 50;
		ar[4] = 10;

		System.out.println("--before sorting--");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		System.out.println("--after sorting--");
		for (int i = 0; i <= ar.length - 1; i++) 
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("--print array in descending order--");
		
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		
		
		
		

	}
}
