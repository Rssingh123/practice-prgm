package tap.java;

public class demo10 {
    public static void main(String[] args) {
        int i, j,k;
        for (i = 1; i <= 5; i++)
        {
        	for (j = 1; j <= i; j++)
        	{
        		System.out.print("i");
        	}
            	if (i==1 || i==5 || j==1 || j--i)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
