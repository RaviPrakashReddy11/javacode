package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter size of array");
	int a[]=new int[s1.nextInt()];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter value of array:");
		a[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b));
}
}
