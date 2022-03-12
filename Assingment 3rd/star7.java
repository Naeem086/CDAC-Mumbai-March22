
class star7
{
	public static void main(String args[])
	{
		int a = 1;
		int b = 7;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=a;k++)
			{
				System.out.print("*");
			}
			
			a+=2;
			
			System.out.println();
		}
		
		for(int y=1;y<=4;y++)
		{
		
			for(int l=1;l<=y+1;l++)
			{
				System.out.print(" ");
			}
			
			for(int m=1;m<=b;m++)
			{
				System.out.print("*");
			}
			
			b-=2;
			
			
			System.out.println();

		}
	}
}