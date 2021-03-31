package Array;

public class MD_Array1 {
	public static void main(String[] args) {

		// 30 40 45
		// 50 60 65
		// 50 60 65

		int ar[][] = new int[3][3];
		ar[0][0] = 30;
		ar[0][1] = 40;
		ar[0][2] = 45;
		ar[1][0] = 50;
		ar[1][1] = 60;
		ar[1][2] = 65;
		ar[2][0] = 50;
		ar[2][1] = 60;
		ar[2][2] = 65;

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}
