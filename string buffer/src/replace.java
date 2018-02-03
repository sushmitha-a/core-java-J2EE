import java.util.Scanner;
import java.util.StringTokenizer;


public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			
			if(s1.equals("is")){
				sb.append("is not");
			}
			else 
				sb.append(s1);
			sb.append(" ");
					
		}
		System.out.println(sb.toString());
		
		
		
		
		
		
		
		
		
	}

}
