package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayReverse 
{
public static void main(String[] args) 
{
   Scanner s1=new Scanner(System.in);
   int a[]=new int[s1.nextInt()];
   int b[]=new int[a.length];
   for(int i=0;i<a.length;i++)
   {
	   System.out.println("enter value for an array:");
	   a[i]=s1.nextInt();
	   
			   
   }
   System.out.println(Arrays.toString(a));
   for(int i=a.length-1;i>=0;i--)
   {
	   b[(a.length-1)-i]=a[i];
   }
   System.out.println(Arrays.toString(b));

}
}
