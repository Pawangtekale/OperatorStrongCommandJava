import java.util.Scanner;
class FindSpicialChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character:");
		char ch=sc.next().charAt(0);
		
		boolean op=(ch>='A' && ch<='Z')||(ch>=97 && ch<=122)|| (ch>=48&&ch<=57);
		System.out.println(!op);
		//System.out.println("Hello World!");
	}
}
