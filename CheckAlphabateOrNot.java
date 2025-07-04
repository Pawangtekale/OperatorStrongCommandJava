import java.util.Scanner;
class CheckAlphabateOrNot 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a character:");
		char ch=new Scanner(System.in).next().charAt(0);
		String op=((ch>=65&&ch<=90||ch>=95&&ch<=122)?"It is Alphabate":"It not Alphabate");
		System.out.println(op);
	}
}
