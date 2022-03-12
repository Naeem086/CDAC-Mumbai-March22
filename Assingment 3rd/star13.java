
class star13
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int m=1;m<=5;m++)
		{
			if(m==1)
				continue;
			
			for(int n=5;n>=m;n--)
			{
				System.out.print(" ");
			}
			
			for(int t=1;t<=m;t++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}