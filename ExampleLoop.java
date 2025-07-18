class ExampleLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Start");
		/*
		// UpperCase A to Z
		for (char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("***********************************************************");
		// LowerCase a to z
		
		for (char ch=97;ch<=122;ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
	    System.out.println("**************************************************************");
		for (char ch=48;ch<=57;ch++)
		{
			System.out.print(ch+" ");
		}
		
		
		System.out.println();
	
		System.out.println("********************************************************************");
		// 1 to 100
		for ( int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		// 100 to 1
		for (int i=100;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		//  0 to 127
		for (char ch=0;ch<=127;ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		// character A to Z & a to Z
		
		for (char ch=0;ch<=127;ch++)
		{
			if (ch>=65 && ch<=90 || ch>=97 && ch<=122)
			{
				System.out.print(ch+" ");
			}
		}
		System.out.println();
		System.out.println("********************************************************************");
		for (char ch=0;ch<=127;ch++)
		{
			if (!(ch>=65 && ch<=90 || ch>=97 && ch<=122))
			{
				System.out.print(ch+" ");
			}	
		}
		System.out.println();
		System.out.println("********************************************************************");
		for (int i=1;i<=100;i++)
		{
			if (i%2==0)
				System.out.print(i+" ");
		
		}
		
		System.out.println();
		System.out.println("********************************************************************");
		for (char ch=90;ch<=65;ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		for (char ch='A'; ch<='Z';ch++)
		{
			System.out.print(ch+":"+(ch+0)+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		for (char ch=65;ch<=90;ch+=2)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("********************************************************************");
		int count =1;
		for (char ch=65;ch<=90;ch+=count)
		{
			System.out.print(ch+" ");
			count++;
			
		}
		
		
		// print lowerCase 'z' to 'a' 
		for (char ch=122;ch>=97;ch--)
		{
			System.out.print(ch+" ");
		}
		// print UperCase Character with its ASCISS Values
		for (char ch=65;ch<=90;ch++)
		{
			System.out.print(ch+":"+(ch+0)+" ");
		}
		// print lower case with Asciss value
		for (char ch=97;ch<=122;ch++)
		{
			System.out.print(ch+":"+(ch+0)+" ");
		}
		
		for (char ch=65;ch<=90;ch+=2)
		{
			System.out.print(ch+" ");
		}
		int count =1;
		for (char ch=65;ch<=90;ch+=count)
		{
			System.out.print(ch+" ");
			count++;
			
		}*/
		for (char ch=65;ch<=122;ch++)
		{
			switch (ch)
			{
			case 'A':
				System.out.println(ch+" Vowel");break;
			case 'E':
				System.out.println(ch+" Vowel");break;
			case 'I':
				System.out.println(ch+" Vowel");break;
			case 'O':
				System.out.println(ch+" Vowel");break;
			case 'U':
				System.out.println(ch+" Vowel");break;
			case 'a':
				System.out.println(ch+" Vowel");break;
			case 'e':
				System.out.println(ch+" Vowel");break;
			case 'i':
				System.out.println(ch+" Vowel");break;
			case 'o':
				System.out.println(ch+" Vowel");break;
			case 'u':
				System.out.println(ch+" Vowel");break;
			
			//default :
				//System.out.println("Special char");
			
			}
		}
		System.out.println();
	    System.out.println("Execution Ends");
	}
}
