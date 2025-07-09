import java.util.Scanner;
class ExampleIfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Boy Age:");
		int age=sc.nextInt();
		System.out.println("Enter Income:");
		long income=sc.nextLong();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Surname");
		String surname=sc1.nextLine().toUpperCase();
		//int age=new Scanner(System.in).nextInt();
		if (age>21 && income>100000000 && surname.equals("AMBANI"))
		{
			System.out.println("Eligible");
		}
		else
			System.out.println("Not Eligible");
	}
}
