package Practice_Java1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01
{
public static void main(String[] args) 
{
	List n1=new ArrayList();
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
	
	System.out.println("Using ListIterator: Forward Direction ");
	ListIterator e1=n1.listIterator();
	while(e1.hasNext())
	{
		System.out.println(e1.next());
	}
	System.out.println("Using ListIterator: Backward Direction ");
	while(e1.hasPrevious())
	{
		System.out.println(e1.previous());
	}
}
}
