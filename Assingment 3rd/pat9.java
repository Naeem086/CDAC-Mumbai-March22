
class pat9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int ab = 65;
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				char ch = (char)ab;
				System.out.print(ch+" ");
				ab++;
			}
			
			System.out.println();
		}
	}
}