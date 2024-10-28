package Practice_Java1;

public class Constructor01 
{
	Constructor01()
	{
		System.out.println("1");
	}
	Constructor01(int a)
	{
		System.out.println("2");
	}
	Constructor01(String s)
	{
		System.out.println("3");
	}
public static void main(String[] args)
{
	Constructor01 n1 = new Constructor01();
	new Constructor01("ravi");
	Constructor01 n2=new Constructor01(9);
}
}
