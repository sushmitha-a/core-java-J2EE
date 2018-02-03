import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


/*Given a method with a HasMap<int,float=""> as input. Write code to find out average of 
all values whose keys are even numbers.
Round the average to two decimal places and return as output.*/
public class hashmap2 {
	public static void main(String[] args){
		float h=0,count=0;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Float> hm = new HashMap<Integer,Float>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextFloat() );
		}
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			int u= itr.next();
			if(u%2==0)
			{
				float t = hm.get(u);
				h=h+t;
				count++;
			}
			
			
		}
		float avg = h/count;
		System.out.println(avg);
	}
}
