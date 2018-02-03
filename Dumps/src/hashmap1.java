import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/*Given a method with a HasMap<Integer,String> as input.Write
code to remove all the entries having keys multiple of 4 and
return the size of the final hasmap.*/
public class hashmap1 {
	public static void main(String[] args){
	    int count=0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      	
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.next());
			
		}
	Iterator<Integer> itr= hm.keySet().iterator();
	while(itr.hasNext())
	{
		int k = itr.next();
		if(k%4!=0)
			count++;
		
	}
	System.out.println(count);
	
	}
}
