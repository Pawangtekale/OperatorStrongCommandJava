import java.util.Scanner;
class PoundsToKilograms 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number in Pound:");
		double pound=sc.nextDouble();
		double kilo=pound*0.454;
		System.out.println(pound+"Pounds is"+kilo+"Kilograms");
	}
}
