import java.util.Scanner;
class HiFive 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number:");
		int num=new Scanner(System.in).nextInt();
		if (num%2==0&& num%5!=0)
		{
			System.out.println("Hi Two");
		}
	 
		if (num%5==0 && num%2!=0)
		{ 
			System.out.println("Hi Five");
		}
		if (num%5==0 && num%2==0)
		{
			System.out.println("HiTwo HiFive");
		}
		
		
	}
}
