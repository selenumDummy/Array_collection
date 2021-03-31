package Exception_Handling;

public class sample3 {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	int c=0;
	try
	{
		 c=a/b;  //risky code
	}
	catch (ArrayIndexOutOfBoundsException d)
	{
		System.out.println("exception handled: ArrayIndexOutOfBoundsException");
		d.printStackTrace();
		c=a/1;
	}
	catch (NullPointerException e)
	{
		System.out.println("exception handled: NullPointerException");
		c=a/1;
	}
	catch (ArithmeticException e)
	{
		System.out.println("exception handled: ArithmeticException");
		c=a/1;
	}
	catch (Exception e) {
		System.out.println("exception handled: generic exception");
		c=a/1;
	}
	
	
	
	System.out.println(c);
	System.out.println("Hii..");
	
	
}
}
