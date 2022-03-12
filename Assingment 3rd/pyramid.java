
class pyramid
{
	public static void main(String args[])
	{
		int a=1;
		int b=7;
		
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
		
		for(int g=1;g<=4;g++)
		{
			for(int n=1;n<=g+1;n++)
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
c=9;
for(int i=1;i<=9;i++)
{
	a=c;
	for(int j=1;j<=i;j++)
	{
			System.out.print(a+" ");
			a++;
	}
	c--;
}