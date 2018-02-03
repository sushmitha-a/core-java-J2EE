import java.util.*;
/* Given a method with an array of strings and one string variable as input .Write code to
 sort the given array in reverse alphabetical order and return the position of the given strin
		 in the array.assume  the position of the first element is 1*/
public class arraylist2 {
	public static void main(String []args)
	{
		ArrayList<String> al = new ArrayList<String>(); 
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int pos=0;
		for(int i=0;i<n;i++)
		{
			al.add(sc.next());
		}
		String s1= sc.next();
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		for(int i=0;i<n;i++)
		{
			if(s1.equals(al.get(i)))
				pos=i+1;
		}
		System.out.println(pos);
	}
}
