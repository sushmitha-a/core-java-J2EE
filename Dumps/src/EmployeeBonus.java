import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;


public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
HashMap<Integer,String> h1=new HashMap<Integer,String>();
HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
	int id= sc.nextInt();
	h1.put(id, sc.next());
	h2.put(id,sc.nextInt());
	
}
   t=User.calSalary(h1,h2);
   java.util.Iterator<Integer> itr = t.keySet().iterator();
   while(itr.hasNext())
   {
	   
	 int s1 = itr.next();
	 System.out.println(s1);
	 int s2 = t.get(s1);
	   System.out.println(s2);
	   
	   
   }
		
		
		
		
		
		
		
	}

}
