
//Given a method with an int array 
//and a number as input.Write code to add all the elements in the array greater 
//than the given number.
//Finally reverse the digits of the obtained sum and return it as output.

import java.util.*;
public class arrays {
public static void main(String[] args)
{
	
	int a[] = {20,25,30,100};
	
    Scanner sc = new Scanner(System.in);
    int b  = sc.nextInt();
   int c=  getv(a,b);
	System.out.println("the value of sum is "+c);
	
	
	
}
public static int getv(int a[],int b)
{
	int sum=0,rev=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>b)
		{
			sum=sum+a[i];
		}
	}
	while(sum!=0)
	{
		int s = sum%10;
		rev=(rev*10)+s;
		sum=sum/10;
	}
	
	
	return rev;
}
}
