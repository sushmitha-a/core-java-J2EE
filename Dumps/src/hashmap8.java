/*nput1 is a map<Integer,Float>
{1:2.3,2:5.6,3:7.7,4:8.4}
get the even number from keys and find the avg of values of these keys.
answer should be rounded to two numbers after decimal
eg:- the output number 15.2499999 should be 15.25*/

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class hashmap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		float sum=0;
		HashMap<Integer,Float> hm = new HashMap<Integer,Float>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextFloat());
		}
        Iterator<Integer> itr = hm.keySet().iterator();
        while(itr.hasNext())
        {
        	Integer s1= itr.next();
        	Float s2= hm.get(s1);
        	if(s1%2==0)
        	{
        		sum=sum+s2;
        		count++;
        	}
        }	
		float avg = sum/count;
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println(df.format(avg));
	
		
	}
}
