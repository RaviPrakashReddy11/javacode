package Practice_Java1;

import java.util.Scanner;

public class String01 
{
	void string_behaviour(String a)
	{
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 4));
		
	}
	void string_behaviour2(String s1,String s2)
	{
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace('R', 'r'));
		System.out.println(s1.replaceAll("Ravi", s2));
	}
public static void main(String[] args)
{
	Scanner n1=new Scanner(System.in);
	String01 n2=new String01();
	System.out.println("Enter a string:");
	n2.string_behaviour(n1.next());
	System.out.println("Enter Two Strings s1 and s2: ");
	n2.string_behaviour2(n1.next(), n1.next());
	
	
}
}
