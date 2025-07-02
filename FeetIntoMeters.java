import java.util.Scanner;
class FeetIntoMeters
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value for Feet:");
		double feet=sc.nextDouble();
		double meters=feet*0.305;
		System.out.println(feet+"Feet is "+meters+"Meters");
	}
}
