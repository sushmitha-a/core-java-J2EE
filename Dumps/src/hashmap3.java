import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
/*Given a method with an ArrayList which contains student information like name and
obtained marks of three subject in string format separated with delimiter'_'.*/
public class hashmap3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max=0;
		ArrayList<String> a1= new ArrayList<String>();
		int n = sc.nextInt();
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			a1.add(sc.next());
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
		String s1= a1.get(i);
		StringTokenizer st = new StringTokenizer(s1,"-");
		String s4= st.nextToken();
		int i2=Integer.parseInt(st.nextToken());
		int i3=Integer.parseInt(st.nextToken());
		int i4=Integer.parseInt(st.nextToken());
		sum=i2+i3+i4;
		hm.put(s4,sum);
		
		}
		Iterator<String> itr = hm.keySet().iterator();
	    String str= null;
		while(itr.hasNext())
		{
			String s = itr.next();
			int i5= hm.get(s);
			if(i5>max)
			{
				max=i5;
				str=s;
			}
			
			
		}
		
		System.out.println(str);
	}
}
