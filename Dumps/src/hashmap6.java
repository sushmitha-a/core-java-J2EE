
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class hashmap6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int sum=0,count=0;
		int s1 = sc.nextInt();
		String q[]=new String[s1];
	    for(int i=0;i<s1;i++)
	    {
	       	q[i]=sc.next();
	    	
	    }
		HashMap<String,String> hm= new HashMap<String,String>(); 
	    for(int j=0;j<s1;j++)
	    {
	    	String h= q[j];
	    	String k = h.substring(0, 3).toUpperCase();
	    	hm.put(k,h);
	    	
	    }
	    	
	    System.out.println(hm);	
	/*Iterator<String> itr= hm.keySet().iterator();
	while(itr.hasNext())
	{
		
	     String se = itr.next();
	     String qw = hm.get(se);
		System.out.println(se);
		System.out.println(qw);
		
	}*/
	}
}

