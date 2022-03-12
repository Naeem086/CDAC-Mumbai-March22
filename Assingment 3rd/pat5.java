
class pat4
{
	public static void main(String args[])
	{
		int ab = 65;
		
		for(int i=1;i<=5;i++)
		{
			char ch = (char)ab;
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			ab++;
			
			System.out.println();
		}
	}
}