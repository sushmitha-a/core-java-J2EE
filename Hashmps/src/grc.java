import java.util.HashMap;
import java.util.Iterator;

import java.util.Scanner;
import java.util.TreeMap;


public class grc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextInt());
		}
		
		
		
		TreeMap<Integer,String> op = new TreeMap<Integer,String>();
		 op=calc(hm);
		 
		 
		 
		 
		 Iterator<Integer> itr1 = op.keySet().iterator();
			while(itr1.hasNext()){
				Integer j = (Integer) itr1.next();
				System.out.println(j);
				String k= op.get(j);
				System.out.println(k);
			}

		
	}
	public static TreeMap<Integer,String> calc(HashMap<Integer, Integer> hm)
	{
		
		TreeMap<Integer,String> hm2= new TreeMap<Integer,String>();
	    Iterator<Integer> itr= hm.keySet().iterator();
	    while(itr.hasNext())
	    {
	  	  int k =(Integer) itr.next();
	  	int v = hm.get(k);
	  	  if(v>=80)
	  	  {
	  		  hm2.put(k,"GOLD");
	  	  }
	  	  else if(v<80 && v>=60)
	  	  {
	  		  hm2.put(k,"SILVER");
	          }
	    else if(v<60 && v>=45)
	    {
	    	hm2.put(k,"BRONZE");
	    }
	    else{
	    	hm2.put(k, "FAIL");
	    }
	  	  
	    }
	    return hm2;
	}
	}


