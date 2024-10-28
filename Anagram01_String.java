package Practice_Java1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram01_String
{
	void check(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
			
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	Anagram01_String n2=new Anagram01_String();
	System.out.println("Enter two strings ");
	n2.check(n1.next(), n1.next());
}
}
