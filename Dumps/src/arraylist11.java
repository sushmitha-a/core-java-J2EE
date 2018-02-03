import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.*;


/*iven a method that takes two integer Arraylist and an operator as char inptu.
 * Depending upon the operator,perform the set operation on two int arrays and return the final 
 * int array.
Refer below for operator value and corresponding operation.
'+' for SET-UNION
'*' for SET-INTERSECTION
'-' for SET-DIFFERENCE*/
public class arraylist11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 int n = sc.nextInt();
		char c = sc.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			al1.add(sc.nextInt());
			
		}
		
		for(int i=0;i<n;i++)
		{
			
				al2.add(sc.nextInt());
			
		
		}
		if(c=='+')
		{
			
			al1.removeAll(al2);
			al1.addAll(al2);
			
		}
		else if(c=='-')
		{
			al1.removeAll(al2);
		}
		else if(c=='*')
		{
			al1.retainAll(al2);
		}
		Iterator<Integer> itr= al1.iterator();
		while(itr.hasNext())
		{
			int  b =itr.next();
			System.out.println(b);
		}
	}

}
