package Array;

public class MD_Array_In_Single_Step {
	public static void main(String[] args) {

		// 30 40 45
		// 50 60 65
		// 50 60 65

		int ar[][] = { { 30, 40,45 }, { 50, 60, 65 },{50, 60, 65} };

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = 0; j <=ar.length-1; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}
