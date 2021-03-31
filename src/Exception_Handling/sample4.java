package Exception_Handling;

public class sample4 {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	int c=0;
	try
	{
		 c=a/b;  //risky code
	}
	catch (Exception e) {
		System.out.println("exception handled: generic exception");
		c=a/1;
	}
	
	
	System.out.println(c);
	System.out.println("Hii..");
	
	
}
}
