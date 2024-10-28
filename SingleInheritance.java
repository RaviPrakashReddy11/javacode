package Practice_Java1;

import java.util.Scanner;

class Par1
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class SingleInheritance extends Par1
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	
	SingleInheritance n1=new SingleInheritance();
	System.out.println("Enter two numbers: ");
	n1.add(s1.nextInt(), s1.nextInt());
}
}
