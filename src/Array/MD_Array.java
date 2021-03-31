package Array;

public class MD_Array {
public static void main(String[] args) {
	
  // 30 40
  // 50 60
	
	
	int ar [][]=new int[2][2];
	ar[0][0]=30;
	ar[0][1]=40;
	ar[1][0]=50;
	ar[1][1]=60;
	
	
	System.out.println(ar[1][1]);  //60
	
	for (int i = 0; i <=ar.length-1; i++) {
		for (int j = 0; j <= ar.length-1; j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
