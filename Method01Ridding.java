package Practice_Java1;
class MR1
{
	void add(int a,int b)
	{
		System.out.println("This is executed");
	}
}
public class Method01Ridding extends MR1
{
	void add(int a,int b)
	{
		super.add(5, 2);
		System.out.println(a+b);
	}
public static void main(String[] args)
{
	Method01Ridding m1=new Method01Ridding();
	m1.add(8, 2);
}
}
