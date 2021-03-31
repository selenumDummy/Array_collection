package Array1;

public class Sample3 {
	public static void main(String[] args) {

		String ar[] = new String[5];
		ar[0] = "ganesh";
		ar[1] = "ramesh";
		ar[2] = "mahesh";
		ar[3] = "rahul";
		ar[4] = "sanjay";

		System.out.println(ar.length); // 5

		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

	}
}
