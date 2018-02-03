/*Get two integer arrays as input.
Find if there are common elements in the arrays. find the number of common elements.*/
import java.util.*;
public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n  = sc.nextInt();
ArrayList<Integer> al1= new ArrayList<Integer>(); 
for(int i=0;i<n;i++)
{
	al1.add(sc.nextInt());
}
ArrayList<Integer> al2= new ArrayList<Integer>(); 
for(int i=0;i<n;i++)
{
	al2.add(sc.nextInt());
}
al1.retainAll(al2);
Iterator itr = al1.iterator();
while (itr.hasNext()) {
	int b = (int) itr.next();
	System.out.println(b);
}
	
	
	}

}
