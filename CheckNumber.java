import java.util.Scanner;
class CheckNumber 
{
	public static void main(String[] args) 
	{
		//Check number is Positive or Negative and Zero -> Nutrual
		System.out.print("Enter A Number:");
		int num=new Scanner(System.in).nextInt();
		if (num>0)
		{
			System.out.println("Given Number is Positive");
		}
		if (num<0)
		{
			System.out.println("Given Number is Negative");
		}
		if (num==0)
		{
			System.out.println("Given Number Is Zero is Nutrual");
		}
	}
}
