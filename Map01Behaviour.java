package Practice_Java1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map01Behaviour 
{
public static void main(String[] args) 
{
	Map<Character,Integer> m1=new HashMap<Character,Integer>();
	m1.put('A', 1);
	m1.put('B', 2);
	m1.put('C', 3);
	m1.put('D', 4);
	System.out.println(m1);
	 Set<Entry<Character,Integer>> s1= m1.entrySet();
	 Iterator<Entry<Character,Integer>> i1=s1.iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	 for(Character s:m1.keySet())
	 {
		 System.out.println(s);
	 }
	 for(Integer i:m1.values())
	 {
		 System.out.println(i);
	 }
	 for(Entry<Character,Integer> e: m1.entrySet())
	 {
		 System.out.println(e);
	 }
}
}
