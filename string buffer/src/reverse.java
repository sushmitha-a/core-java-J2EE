import java.util.Scanner;
import java.util.StringTokenizer;


public class reverse {
	public static void main(String []args){
     
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
		  String s1= st.nextToken();	
        if(s1.length()%2==0)
		{
		for(int i=0;i<s.length();i=i+2)
		{
			sb.append(s1.charAt(i+1));
			sb.append(s1.charAt(i));
			
			
		}
		}
		else
		{
			
			for(int i=0;i<s.length();i=i+2)
			{
				if(i==s.length()-1)
				{
					sb.append(s1.charAt(i));
				}
				else
				{
				sb.append(s1.charAt(i+1));
				sb.append(s1.charAt(i));
			}
			}
		}
			
		}
		System.out.println(sb.toString());
	
	
	
	
	
	}
	
}
