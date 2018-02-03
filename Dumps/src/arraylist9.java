/* Given a method with an input n of type int. Write code to generate fibonacci series
and calculate the sum of first n numbers in the series and return it as output.
Note: First two numbers in a Fibonacci
are 0,1 and all other subsequent numbers are sum of its previous
two numbers. */
import java.util.*;
public class arraylist9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1,sum=1;
		System.out.println(a);
		System.out.println(b);
	for(int i=0;i<n-2;i++)
		{
		   c=a+b;
		  sum=sum+c;
		
		System.out.println(c);
		
		a=b;
		b=c;
		
	}
System.out.println(sum);
}
}