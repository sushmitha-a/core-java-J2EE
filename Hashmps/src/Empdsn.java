import java.util.*;
public class Empdsn {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	LinkedHashMap<String,String> hm= new LinkedHashMap<String,String>();
	for(int i=0;i<n;i++)
	{
		hm.put(sc.next(),sc.next());
	}
	String s= sc.next();
	LinkedHashMap<String,String> op = new LinkedHashMap<String,String>();
	op=abc(hm, s);
	Iterator<String> itr1 = op.keySet().iterator();
	while(itr1.hasNext()){
		String j = (String) itr1.next();
		System.out.println(j);
	}
	
}

private static LinkedHashMap<String, String> abc(LinkedHashMap<String, String> hm,
		String s) {
	// TODO Auto-generated method stub
	 LinkedHashMap<String,String> hm2= new LinkedHashMap<String,String>();
     Iterator<String> itr= hm.keySet().iterator();
     while(itr.hasNext())
     {
   	  String k =(String) itr.next();
   	  String v = hm.get(k);
   	  if(v.equals(s))
   	  {
   		  hm2.put(k,v);
   	  }
     }
     
   
     return hm2;
}


}
