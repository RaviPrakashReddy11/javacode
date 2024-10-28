package Practice_Java1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Enumeration01 
{
public static void main(String[] args)
{
	List n1=new Vector();
	n1.add(51);
	n1.add("Ravi");
	n1.add(null);
	n1.add(true);
	n1.add(3.14f);
	System.out.println(n1);
	Iterator i1=n1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	Vector v1=new Vector();
	v1.add(51);
	v1.add("Ravi");
	v1.add(null);
	v1.add(true);
	v1.add(3.14f);
	System.out.println(v1);
	
	Enumeration e1=v1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
}
}
