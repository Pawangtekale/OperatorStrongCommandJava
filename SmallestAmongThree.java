class SmallestAmongThree 
{
	public static void main(String[] args) 
	{
		int a=2,b=9,c=4;
		String op=((a<b)?(a<c?"Smallest is:"+a:"Smallest is:"+b):(b<c)?"Smallest is:"+b:"Smallest is:"+c);
		System.out.println(op);
	}
}
