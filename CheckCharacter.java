import java.util.Scanner;
class CheckCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character:");
		char ch=sc.next().charAt(0);
		
		boolean op=(ch>='A' && ch<='Z')||(ch>=97 && ch<=122);
		System.out.println(op);
	}
}

