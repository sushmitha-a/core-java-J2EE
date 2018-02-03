/*Given a method with an int array list as an input.Write code to remove every 3rd 
element and return the finasl array list.suppose the given array list contains 
10 elements remove the 3rd,6th and 9th element.*/
import java.util.*;
public class arraylist1 {
public static void main(String []args)
{
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	for(int i=0;i<n;i++)
	{
		al.add(sc.nextInt());
	}
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
	      if(i%3!=0)
	    	  al1.add(al.get(i));
	}
	System.out.println(al1);
	
}
}
