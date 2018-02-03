import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class GradeCalc {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	LinkedHashMap<String,Double> hm= new LinkedHashMap<String,Double>();
	for(int i=0;i<n;i++)
	{
		hm.put(sc.next(),sc.nextDouble());
	}
	
	LinkedHashMap<String,String> op = new LinkedHashMap<String,String>();
	 op=calc(hm);
	 Iterator<String> itr1 = op.keySet().iterator();
		while(itr1.hasNext()){
			String j = (String) itr1.next();
			System.out.println(j);
			String k= op.get(j);
			System.out.println(k);
		}

	
}
public static LinkedHashMap<String,String> calc(LinkedHashMap<String,Double> hm)
{
	
	LinkedHashMap<String,String> hm2= new LinkedHashMap<String,String>();
    Iterator<String> itr= hm.keySet().iterator();
    while(itr.hasNext())
    {
  	  String k =(String) itr.next();
  	double v = hm.get(k);
  	  if(v>=60)
  	  {
  		  hm2.put(k,"PASS");
  	  }
  	  else
  		  hm2.put(k,"FAIL");
    }
    return hm2;
}
    
}


