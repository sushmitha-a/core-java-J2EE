package extractnum;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String []args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(Character.isDigit(c))
			{
				int a = Character.getNumericValue(c);
				sum=sum+a;
			}
		}
	System.out.println(sum);
	}
	
	
	
}
