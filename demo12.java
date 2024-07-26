package tap.java;
import java.util.Scanner;
public class demo12 {
	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
	
	    int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum1=a+b;
        int sum2=a+c;
        int sum3=b+c;
        System.out.println(sum1+"\n"+sum2+"\n"+sum3);
       // System.out.println(sum2);
       // System.out.println(sum3);

}
}

/*
Output
Enter three numbers
10 20 30
30
40
50

 */




