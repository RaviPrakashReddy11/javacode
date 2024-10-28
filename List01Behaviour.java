package Practice_Java1;

import java.util.ArrayList;
import java.util.List;

public class List01Behaviour
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
	n1.add(51);
	n1.add("Ravi");
	n1.add(null);
	n1.add(true);
	n1.add(3.14f);
	System.out.println(n1);
	
	n1.addAll(n1);
	System.out.println(n1);
	System.out.println(n1.contains(51));
	System.out.println(n1.get(3));
	System.out.println(n1.remove(5));
	System.out.println(n1.remove(null));
	System.out.println(n1.size());
	System.out.println(n1.indexOf("Ravi"));
	n1.set(5, "Prakash");
	System.out.println(n1);
	n1.clear();
	System.out.println(n1);
	
	
}
}
