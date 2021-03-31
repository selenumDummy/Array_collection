package Array1;
public class Sample9 {
//  0  1  2
//0 10 20 25
//1 30 40 45
	
	
public static void main(String[] args) {
	
	int ar [][]=new int[2][3];
	ar[0][0]=10;
	ar[0][1]=20;
	ar[0][2]=25;
	ar[1][0]=30;
	ar[1][1]=40;
	ar[1][2]=45;
	
				
for(int i=0; i<=1; i++) {
	for(int j=0; j<=2; j++) {
		System.out.print(ar[i][j]+ " ");
	}
	System.out.println();
}
	
	
	
	
	
	
}
}
