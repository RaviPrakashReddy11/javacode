package Practice_Java1;

import java.util.Scanner;

class Par2
{
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
class Par11 extends Par2
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class MultiLevel1 extends Par11
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	MultiLevel1 m1=new MultiLevel1();
	System.out.println("enter values to  add:");
	m1.add(s1.nextInt(), s1.nextInt());
	System.out.println("enter values to sub:");
	sub(s1.nextInt(),s1.nextInt());
}
}
