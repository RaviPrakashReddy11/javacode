package Practice_Java1;
abstract class New01
{
	abstract void add(int a,int b);
}

public class AbstractClass01 extends New01
{
public static void main(String[] args)
{
	AbstractClass01 n1=new AbstractClass01();
	n1.add(8, 9);
}

@Override
void add(int a, int b) {
	// TODO Auto-generated method stub
	
}
}
