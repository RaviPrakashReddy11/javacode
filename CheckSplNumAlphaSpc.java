package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSplNumAlphaSpc
{
	void check(String s)
	{
		int alphacount=0;
		int numcount=0;
		int spccount=0;
		int splcount;
		char c1[]=s.toCharArray();
		System.out.println(c1);
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean a=Character.isLetter(c1[i]);
			if(a==true)
			{
				alphacount++;
			}
			boolean b=Character.isDigit(c1[i]);
			if(b==true)
			{
				numcount++;
			}
			boolean c=Character.isWhitespace(c1[i]);
			if(c==true)
			{
				spccount++;
			}
		}
		System.out.println(alphacount);
		System.out.println(numcount);
		System.out.println(spccount);
	}
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter string: ");
	CheckSplNumAlphaSpc n2=new CheckSplNumAlphaSpc();
	n2.check(s1.nextLine());
	
}
}
