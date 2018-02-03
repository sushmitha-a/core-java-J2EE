/*Given a method with two int int array lists of size as input.Write code to fetch the odd index 
 * elements from first array list and even index elements from second array list
 * and add them to a
 *  new array list according to their index.Return the new array list.*/
import java.util.*;
public class arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al1 = new ArrayList<Integer>();
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 ArrayList<Integer> al3 = new ArrayList<Integer>();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 al1.add(sc.nextInt());
		 }
		 for(int j=0;j<n;j++)
		 {
			 al2.add(sc.nextInt());
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(i%2==0)
			 {
				 al3.add(al2.get(i));
			 }
			 else 
				 al3.add(al1.get(i));
		 }
		 Iterator itr = al3.iterator();
		 while(itr.hasNext())
		 {
			 int i = (int) itr.next();
			 System.out.println(i);
		 }
		 
		 
		 
		 
	} 

}
