package Exception_Handling;

public class sample1 {
public static void main(String[] args) {
	
	
	int ar []= new int[4];
	ar[0]=10;
	ar[1]=20;
	ar[2]=30;
	ar[3]=40;
	
	
	try {
		ar[4]=50;
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("exception handled");
	}
	
}
}
