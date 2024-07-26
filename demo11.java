package tap.java;

class demo11
{
	public static void main(String[] args)
	{
		int n=5;
		char ch = 'E';
		for(int i=1; i<=n; i++)
		{
			for(int k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2; j++)
			{
				if(i==1 && j==1)
				{	
					System.out.print(ch);
				}
				else if(i ==1 && j ==2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(ch);
				}
			}
			ch--;
			System.out.println();
		}
	}
}


/*
Output
    E 
   DD
  CC
 BB
AA
 */











