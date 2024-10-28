package Practice_Java1;

public class C1
{
	int a;
void ravi(int a)
{
	System.out.println("1");
	System.out.println(a);
}
void ravi(String b)
{
	System.out.println("2");
}
static void ri()
{
	System.out.println("s1");
}
static void ri(int c)
{
	System.out.println("s2");
}
public static void main(String[] args)
{
	C1 n1=new C1();
	n1.ravi(4);
	n1.ravi("es");
	ri();
	ri(81);
	
}
}
