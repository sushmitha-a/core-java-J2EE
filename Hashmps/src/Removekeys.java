import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Removekeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.next());
		}
		
		
		int op=abc(hm);
		System.out.println(op);
		
	}

	private static int abc(HashMap<Integer, String> hm)
			 {
		// TODO Auto-generated method stub
		int hm2=0;
	     Iterator<Integer> itr= hm.keySet().iterator();
	     while(itr.hasNext())
	     {
	   	  int k = itr.next();
	   	  
	   	  if(k%4!=0)
	   	  {
	   		  hm2++ ;  	  }
	     }
	     
	   
	     return hm2;
	}
	}


