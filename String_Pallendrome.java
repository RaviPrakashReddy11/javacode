package Practice_Java1;

import java.util.Scanner;

public class String_Pallendrome 
{
	void check(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+(s.charAt(i));
			System.out.println("Res: "+res);
		}
			if(s.equals(res))
			{
				System.out.println("Pallendrome");
			}
			else
			{
				System.out.println("Not Pallendrome");
			}
		
	}
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String_Pallendrome sp1=new String_Pallendrome();
	sp1.check(s1.next());
	
}
}
