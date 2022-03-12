class pat2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int ab = 65;
			for(int j=1;j<=i;j++)
			{
				char ch = (char)ab;
				System.out.print(ch+" ");
				ab++;
			}
			System.out.println();
		}
	}
}