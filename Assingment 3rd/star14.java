
class star14

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
				System.out.print(" *");
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
			
			for(int o=1;o<=m;o++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
}