package Practice_Java1;
class S12
{
	S12()
	{
		System.out.println("1");
	}
	S12(int a)
	{
		System.out.println("2");
	}
	S12(String s)
	{
		System.out.println("3");
	}
	
}
public class Super01Calling extends S12
{
	Super01Calling() 
	{
		System.out.println("a");
	}
	Super01Calling(String a) 
	{
		super(8);
		System.out.println("b");
	}
	Super01Calling(int a) 
	{
		super("ravi");
		System.out.println("c");
	}
	
public static void main(String[] args)
{
	Super01Calling n1=new Super01Calling();
	new Super01Calling("ivar");
	new Super01Calling(9);
}
}
