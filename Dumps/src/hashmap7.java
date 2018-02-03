import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
/*I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
i/p 2="hari";*/
public class hashmap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hm = new HashMap<String,String>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.next(),sc.next());
		}
		String s= sc.next();
        Iterator<String> itr = hm.keySet().iterator();
        while(itr.hasNext())
        {
        	String s1= itr.next();
        	String s2= hm.get(s1);
        	if(s2.equals(s))
        	{
        		System.out.println(s1);
        	}
        }
		
		
	}

}
