package Practice_Java1;

import java.util.Scanner;

public class SwitchCase
{
	void case1(int s1)
	{
		
		switch(s1)
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default://when you enter case number which is out of range, then default will print
			System.out.println("Exexuted Switch case successfully");
		}
		
		
		
	}
public static void main(String[] args)
{
	Scanner e1=new Scanner(System.in);
	SwitchCase sc1=new SwitchCase();
	System.out.println("Enter any Case number: ");
	sc1.case1(e1.nextInt());
}
}
