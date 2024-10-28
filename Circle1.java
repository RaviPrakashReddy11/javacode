package Practice_Java1;

import java.util.Scanner;

public class Circle1
{
	float pi=3.14f;
void area(float r)
{
	double d= pi*r*r;
	System.out.println(d);
}
void areaRect(int a,int b)
{
	System.out.println(a*b);
}
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	Circle1 c1=new Circle1();
	System.out.println("Enter Radius");
	c1.area(s1.nextFloat());
	System.out.println("Enter Length and Breadth:");
	c1.areaRect(s1.nextInt(), s1.nextInt());
}
}
