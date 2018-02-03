 /*Retrieve the odd-position digits from input integer array.
 Multiply them with their index and return their sum.*/
import java.util.Scanner;


public class arrays7 {
public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	int sum=0;
	int n =sc.nextInt();
	int a[]= new int[n];
	for(int j=0;j<n;j++)
	{
		a[j]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(i%2!=0)
		{
			sum=sum+(a[i]*i);
		}
	}
	
	System.out.println(sum);
	
}
}
