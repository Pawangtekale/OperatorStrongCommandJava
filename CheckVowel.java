import java.util.Scanner;
class CheckVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Character:");
		char ch=new Scanner (System.in).next().toUpperCase().charAt(0);
		boolean op= (ch=='A'||ch=='E' || ch=='I'|| ch=='O'|| ch=='U');
		System.out.println(op);
	}
}
