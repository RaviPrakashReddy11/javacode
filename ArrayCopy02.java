package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy02
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter size of array");
	int a[]=new int[s1.nextInt()];
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter value of array:");
		a[i]=s1.nextInt();
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(a));	
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.equals(a, b));
	
}
}
