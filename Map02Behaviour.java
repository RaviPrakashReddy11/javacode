package Practice_Java1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map02Behaviour 
{
public static void main(String[] args)
{
	Map<String,String> m1=new HashMap<String,String>();
	m1.put("M1", "Ravi");
	m1.put("M2", "Prakash");
	m1.put("M3", "Reddy");
	m1.put("M4", "Mulinti");
	System.out.println(m1);
	m1.putAll(m1);
	m1.putIfAbsent("M5", "yoyo");
	System.out.println(m1);
	for(String s:m1.keySet())
	{
		System.out.println(s);
	}
	for(String s1:m1.values())
	{
		System.out.println(s1);
	}
	for(Entry<String, String> s1: m1.entrySet())
	{
		System.out.println(s1);
	}
	Set<Entry<String, String>> s1=m1.entrySet();
	Iterator<Entry<String, String>> i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
}
}
