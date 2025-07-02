import java.util.Scanner;
class CalculatingEnergy 
{
	public static void main(String[] args) 
	{
		double q,m,finalTemp,initialTemp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount of Water in Kiliograms:");
		m=sc.nextDouble();
		System.out.println("Enter the Initial Temp:");
		initialTemp=sc.nextDouble();
		System.out.println("Enter the Final Temp:");
		finalTemp=sc.nextDouble();
		q=m*(finalTemp-initialTemp)*4184;
		System.out.println("The Energy needed is:"+q);
	}
}
