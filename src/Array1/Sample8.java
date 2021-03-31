package Array1;
public class Sample8 {
//  0  1  
//0 10 20 
//1 30 40 
	
	
public static void main(String[] args) {
	
	int ar [][]=new int[2][2];
	ar[0][0]=10;
	ar[0][1]=20;
	ar[1][0]=30;
	ar[1][1]=40;
	System.out.println(ar[1][1]);
				//2<=1
	for(int i=0; i<=1; i++)
	{				//2<=1
		for(int j=0; j<=1; j++) 
		{					// 1 1
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
}
}
