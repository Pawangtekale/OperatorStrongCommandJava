import java.util.Scanner;
class TerunaryOperatorCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num1:");
		float num1=sc.nextFloat();
	    System.out.println("Enter a Num1:");
		float num2=sc.nextFloat();
		System.out.println("Enter a Operator:");
		char ch=sc.next().charAt(0);
		
		String op="";
		
		op=(ch=='+')?
			(op+=num1+num2):
			((ch=='-')?(op+=num1-num2):((ch=='*')?(op+=num1*num2):((ch=='/')?(op+=num1/num2):
			((ch=='%')?(op+=num1%num2):(op+="Invalid")))));
		if (op.equals("Invalid"))
		{
			System.out.println("Invalid Operator is:"+ch);
			return;
		}
		System.out.println(num1+" "+ch+" "+num2 +"="+(op));
		
		
		
	}
}
