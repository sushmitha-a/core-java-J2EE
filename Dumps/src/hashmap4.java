import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

/*Given a method with two hash maps as input. First HashMap<Integer,String> contains employee id
as key and designation as value, second HashMap<Integer, Integer> contains same employee id as
key and salary as value.
Company decides to increase the salary of managers by 5000.
Create a fresh HashMap<Integer,Integer> with only managers id and their increased salary and 
return this hash map as output.*/

public class hashmap4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		HashMap<Integer,Integer> hm1= new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm2= new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.next());
		}
	
		for(int i=0;i<n;i++)
		{
			hm1.put(sc.nextInt(),sc.nextInt());
		}
		
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			int s= itr.next();
			String s1 = hm.get(s);
			if(s1.equals("manager"))
			{
				int r = hm1.get(s);
				r=r+5000;
			   	hm2.put(s,r);
			}
			
		}
		
		System.out.println(hm2);
}
}
