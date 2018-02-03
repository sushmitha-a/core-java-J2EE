/*Given array of string check whether all the elements contains only digits not any alaphabets.
if condn satisfied print 1 else -1.*/

import java.util.*;

public class arrays8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=1,i; 
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       String s[] = new String[n];
       for(i=0;i<n;i++)
       {
    	   s[i]=sc.next();
    	   
       }
       for(i=0;i<n;i++)
       {
    	   String s1= s[i];
    	   for(int j=0;j<s1.length();j++)
    	   {
    		   char c = s1.charAt(j);
    		   if(Character.isDigit(c))
    		   d=1;
    	   
    	   else
    	   {
    		   d=-1;
    		  
       }
    		if(d==-1)
    			break;
    		   
    	   }
       }
       
       
      System.out.println(d);
		
		
	}

}
