package Array1;

public class sample1 {
	public static void main(String[] args) {

		String ar[] = new String[5];
		ar[0] = "ganesh";
		ar[1] = "ramesh";
		ar[2] = "mahesh";
		ar[3] = "rahul";
		ar[4] = "sanjay";
		// ar[5]="xyz";

		System.out.println(ar[2]); // mahesh
		System.out.println("---print all info in array-----");

		for (int i = 0; i <= 4; i++)
		{
			System.out.println(ar[i]);
		}

	}
}
