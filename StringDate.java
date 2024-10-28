package Practice_Java1;

import java.util.Date;

public class StringDate
{
public static void main(String[] args)
{
	Date d1=new Date();//calling constructor of non para type
	System.out.println(d1.getTime());//epoch convertor
	Date d2=new Date(d1.getTime());//Calling constructor of para type
	System.out.println(d2);
	String current_time=d2.toString();
	System.out.println(current_time);
	System.out.println(current_time.length());
	System.out.println(current_time.substring(current_time.length()-4));
	Date d3=new Date(d1.getTime()+(1000*60*60*24*3));
	System.out.println(d3);
	//past time
	Date d4=new Date(d1.getTime()-(1000*60*60*24*3));
	System.out.println(d4);
}
}
