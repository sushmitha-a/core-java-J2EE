/*Given a method with two int array list of size 5 each as input. 
 * Write code to merge the two array lists, Sort the merged array list in ascending order and 
 * fetch the elements at 2nd, 6th and 8th index into a new array lists and return the final
 *  ArrayList. 
 *Note- the first element is at index 0.*/
import java.util.*;
public class arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> al1 = new ArrayList<Integer>();
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 ArrayList<Integer> al3 = new ArrayList<Integer>();

		 for(int i=0;i<5;i++)
		 {
			 al1.add(sc.nextInt());
		 }
		 for(int j=0;j<5;j++)
		 {
			 al2.add(sc.nextInt());
		 } 
		
		al1.addAll(al2);
		Collections.sort(al1);
		System.out.println(al1.get(2));
		System.out.println(al1.get(6));
		System.out.println(al1.get(8));
		
		
	}

}
