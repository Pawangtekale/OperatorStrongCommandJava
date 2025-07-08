import java.util.Scanner;
class VowelOrConsontOnlyUsingIf 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Character:");
		char ch=new Scanner(System.in).next().toUpperCase().charAt(0);
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Entered Character is Vowels");
		}
		if (ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')
		{
			System.out.println("Entered Character is Consont");
		}
	}
}
