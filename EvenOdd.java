import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int num=sc.nextInt();
		//boolean op=num%2==0;
		//System.out.println(op);
		
		System.out.println(num%2==0:"Num is Even"?"Num is odd");
	}
}
