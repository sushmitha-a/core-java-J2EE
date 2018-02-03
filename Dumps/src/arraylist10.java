import java.util.*;

/*Given a method taking two strings as parameters.
 *  Write code to check whether or not they have dashes in the same places
(return 1 if they do and 2 otherwise).*/
public class arraylist10 {
public static void main(String[]args){
	 ArrayList<Integer> al1 = new ArrayList<Integer>();
	 ArrayList<Integer> al2 = new ArrayList<Integer>();

	 Scanner sc = new Scanner(System.in);
	
	
	 String s1=sc.next();
	 String s2= sc.next();
	 
	
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)=='-')
		{
			al1.add(i);
		
	}
	}
	for(int i=0;i<s2.length();i++)
	{
		if(s2.charAt(i)=='-')
		{
			al2.add(i);
		
	}
	}
	if(al1.size()==0||al2.size()==0)
		System.out.println(-1);
	else if(al1.equals(al2))
		System.out.println("1");
	else
		System.out.println("-1");
	
	

}
}
