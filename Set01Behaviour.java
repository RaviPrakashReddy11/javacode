package Practice_Java1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01Behaviour 
{
public static void main(String[] args)
{
	Set n1=new HashSet();
	n1.add(51);
	n1.add(null);
	n1.add("Ravi");
	n1.add('c');
	n1.add(true);
	System.out.println(n1);
	n1.addAll(n1);
	System.out.println(n1);
	Iterator i1= n1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
}
}
