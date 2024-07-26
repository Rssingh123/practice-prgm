package tap.java;

class Calc
{
	int add(int x, int y)
	{
		int sum=x+y;
		return sum;
	}
	void printSquarePattern(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class demo16 {
	public static void main(String[] args) 
	{
	Calc1 c =new Calc1();
	System.out.println(5);
	}
}