package Practice_Java1;

public class LongestStringWord
{
public static void main(String[] args)
{
	String s1="Large is Best";
	int max=0;
	int curr=0;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)!=' ')
		{
			curr++;
		
		if(curr>max)
		{
			max=curr;
		}
	}
	}
	
}
}
