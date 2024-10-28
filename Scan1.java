package Practice_Java1;

import java.util.Scanner;

public class Scan1
{
	void main(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	Scan1 n1=new Scan1();
	n1.main(s1.nextInt(), s1.nextInt());
}
}
