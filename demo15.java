package tap.java;
class Calc
{
	int add(int x, int y)
	{
		int sum=x+y;
		return sum;
	}
	
}

public class demo15 {
	public static void main(String[] args) 
	{
	Calc c =new Calc();
	int a =10;
	int b=20;
	int	result=c.add(a,b);
	System.out.println(result);
	}
}

//output 30


