package Practice_Java1;

public class This01Calling 
{
	This01Calling()
	{
		this("ravi");
		System.out.println("1");
	}
	This01Calling(int a)
	{
		System.out.println("2");
	}
	This01Calling(String s)
	{
		this(8);
		System.out.println("3");
	}
public static void main(String[] args)
{
	This01Calling n1=new This01Calling();
}
}
