
class pyramid4
{
	public static void main(String args[])
	{
		int c=0;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			int a=c;
			for(int l=1;l<=i;l++)
			{
				if(a==0)
					continue;
				System.out.print(a+" ");
				a--;
			}
			c++;
			
			System.out.println();
		}
	}
}