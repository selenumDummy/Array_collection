package Array;

public class demo1 {
	public static void main(String[] args) {

		// 1. Array declaration
		String ar[] = new String[5];

		// 2. Array initialization
		ar[0] = "mahesh";
		ar[1] = "ramesh";
		ar[2] = "suresh";
		ar[3] = "ganesh";
		ar[4] = "rahul";
		// ar[5]="abc";

		// 3. Array usage
		System.out.println(ar[2]); // suresh

		for (int i = 0; i <= (ar.length - 1); i++) {
			System.out.println(ar[i]); // mahesh ramesh suresh ganesh rahul
		}

//	for (int i = 0; i <=4 ; i++) 
//	{
//		System.out.println(ar[i]);  //mahesh  ramesh suresh ganesh rahul
//	}

	}
}
