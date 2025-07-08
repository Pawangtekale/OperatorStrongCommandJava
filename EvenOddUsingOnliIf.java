import java.util.Scanner;
class EvenOddUsingOnliIf{
	public static void main(String[] args){
		System.out.print("Enter a Number:");
		int num=new Scanner(System.in).nextInt();
		if (num%2==0)
		{
			System.out.println(num+"its Even Number");
			
		}
		if (num%2!=0)
		{
			System.out.println(num+"its Odd Number");
		}	
	}
	
}
