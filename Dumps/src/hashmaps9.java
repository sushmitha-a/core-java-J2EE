import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
String[] input2={“speaker”,”mouse”};
Float output=600.80(500.6+100.2)*/
public class hashmaps9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float sum=0;
		Scanner sc = new Scanner(System.in);
		HashMap<String,Float> hm = new HashMap<String,Float>();
		int a1= sc.nextInt();
		String a[] = new String[a1];
		
		
		for(int i=0;i<a1;i++)
		{
			hm.put(sc.next(),sc.nextFloat());
		}
		int a3= sc.nextInt();
		for(int j=0;j<a3;j++)
		{
		         a[j]= sc.next();
		}
		         
        Iterator<String> itr = hm.keySet().iterator();
        while(itr.hasNext())
        {
        	String s1= itr.next();
        Float s2= hm.get(s1);
        	for(int i1=0;i1<a3;i1++)
        	{
        		if(s1.equals(a[i1]))
        			sum=sum+s2;
        	}
        }
        DecimalFormat df = new DecimalFormat(".00");
        
		System.out.println(df.format(sum));
		
	}

}
