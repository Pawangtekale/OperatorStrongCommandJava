import java.util.Scanner;
class AvgrageSpeed 
{
	public static void main(String[] args) 
	{
		double miles=24;
		int hours=1, minutes=40,seconds=35;
		double totalHours=hours+(minutes/60.0)+(seconds/3600.0);
		
		double kilometers=miles*1.6;
		double avgSpeed=kilometers/totalHours;
		
		
		System.out.println("Average Speed kilometers per hours is:"+avgSpeed);
	}
}
