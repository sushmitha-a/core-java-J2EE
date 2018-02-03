import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.*/
public class hashmap5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int sum=0,count=0;
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>(); 
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextInt());
			
		}
	Iterator<Integer> itr= hm.keySet().iterator();
	while(itr.hasNext())
	{
		int k = itr.next();
		int h = hm.get(k);
		if(k%2!=0)
		{
			sum=sum+h;
		count++;
		}
		
	}
	int avg = sum/count;
	System.out.println(avg);
	
	
	}
}
