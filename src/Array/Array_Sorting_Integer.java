package Array;

import java.util.Arrays;

public class Array_Sorting_Integer {
	public static void main(String[] args) {

		int ar[] = { 10, 20, 30, 25, 15 };
		System.out.println("----before sorting-----");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

		Arrays.sort(ar);
		System.out.println("----Asscending order-----");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("----Descending order-----");
		for (int i = (ar.length - 1); i >= 0; i--) {
			System.out.println(ar[i]);
		}

	}
}
