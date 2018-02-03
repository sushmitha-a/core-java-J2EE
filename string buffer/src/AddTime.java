import java.util.Scanner;
import java.util.StringTokenizer;


public class AddTime {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	String s1= sc.next();
	String s2= sc.next();
	StringTokenizer st= new StringTokenizer(s1,":");
	int h1= Integer.parseInt(st.nextToken());
	int h2= Integer.parseInt(st.nextToken());
	int h3= Integer.parseInt(st.nextToken());
	
	StringTokenizer st1= new StringTokenizer(s2,":");
	int i1= Integer.parseInt(st1.nextToken());
	int i2= Integer.parseInt(st1.nextToken());
	int i3= Integer.parseInt(st1.nextToken());
	
	int s= h3+i3;
	int m= h2+i2;
	int h= h1+i1;
	int d=0;
	if(s>=60)
	{
		m=m+1;
		s=s-60;
	}
	
	if(m>=60)
		{
			h+=1;
			m-=60;
		}
			if(h>=24)
			{
				d+=1;
				h-=24;
			}
		
	StringBuffer sb = new StringBuffer();
	sb.append(d);
	sb.append(":");
	sb.append(h);
	sb.append(":");
	sb.append(m);
	sb.append(":");
	sb.append(s);
	System.out.println(sb.toString());
	
	
	
}
}
