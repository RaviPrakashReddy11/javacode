package Practice_Java1;

import java.util.Scanner;

public class Reverse_String
{
	void reverse(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+(s.charAt(i));
		}
		System.out.println("Result: "+res);
	}
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a String");
	Reverse_String n1=new Reverse_String();
	n1.reverse(s1.next());
}
}
