/* Given a method with two int arr ays eg.A{2,3,5,1} anb B{1,3,9}. 
 * write code to find out sum of common elements in given arrays if no common elements are
 *  found return-1
Assume the common element appears only ones in each array.*/
import java.util.*;
public class arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			al1.add(sc.nextInt());
		}
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			al2.add(sc.nextInt());
		}
		al1.retainAll(al2);
		for(int j=0;j<al1.size();j++)
		{
			sum=sum+(al1.get(j));
		}
		if(sum<=0)
		{
			System.out.println("-1");
		}
		else
			System.out.println(sum);
		
	}

}
