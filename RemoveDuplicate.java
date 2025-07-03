class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		UniqueDiggit(11243342);
		System.out.println();
		UniqueDiggit(55456778);
	}
	public static void UniqueDiggit(int num){
		
		for (int i=1;i<=9;i++)
		{
			
			int count=0;
			int temp=num;
			while (temp>0)
			{
				if (temp%10==i)
				{
					count++;
				}
				temp/=10;
			}
			if (count>0)
			{
				System.out.print(i);
			
			}
		}
	}
}
