import java.util.StringTokenizer;


public class UserMainCode {

	public static int countNoOfWords(String inp1, String inp2)  {
		// TODO Auto-generated method stub
		int count=0;
		StringTokenizer st = new StringTokenizer(inp2," ");
		    String s = st.nextToken();	
		    String s1 =st.nextToken();
		StringTokenizer st1 = new StringTokenizer(inp1," ");
		while(st1.hasMoreTokens())
		{
			String s2 = st1.nextToken();
			if(s1.equals(s2))
				count++;
			
		}
		
		return count;
		
	}

}
