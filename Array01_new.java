package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array01_new
{
	
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Array size: ");
	int a[]=new int[s1.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter value in a Array: ");
		a[i]=s1.nextInt();
	}
	System.out.println(a);
	System.out.println(Arrays.toString(a));
	
	for (int i=0;i<a.length;i++)
	{
		if(a[i]==34)
		{
			System.out.println("index of 34 is: "+i);
			System.out.println("present");
		}
	}
	
}


}
