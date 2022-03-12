
class star9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int u=1;u<=4;u++)
		{
			for(int d=1;d<=u+1;d++)
			{
				System.out.print(" ");
			}
			
			for(int l=4;l>=u;l--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}