package Exception_Handling;

public class Sample {
public static void main(String[] args) 
{
	
	
	int a=10;
	int b=0;
	int c=0;
	try
	{
		 c=a/b;  //risky code
	}
	catch (ArithmeticException e) 
	{
		System.out.println("exception handled");
		c=a/1;
	}
	
	
	System.out.println(c);
	System.out.println("Hii..");
	
	
}
}
