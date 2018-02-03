
//Find the sum of the numbers in the given input string array

import java.util.Scanner;


public class array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
        String s1[]= new String[n];
        for(int i=0;i<n;i++)
        {
        	s1[i]=sc.next();
        }
		for(int l=0;l<n;l++)
		{
		   String s = s1[l];
		   for(int k=0;k<s.length();k++)
		   {
			   char j = s.charAt(k);
			   if(Character.isDigit(j))
			   {
				int u = Character.getNumericValue(j);
				   sum=sum+u;
			   }
		   }
		  
		}
       
		
		System.out.println(sum);
		
	}

}
