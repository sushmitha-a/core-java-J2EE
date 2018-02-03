import java.util.StringTokenizer;


public class UserMainCode {

	public static String negativestring(String s) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(s," ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens())
		{
			String s1= st.nextToken();
			if(s1.equals("is"))
			{
				sb.append("is not");
			}
			else
				sb.append(s1);
			  sb.append(" ");
			
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		
		return sb.toString();
	}

}
