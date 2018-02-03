import java.util.Scanner;
import java.util.StringTokenizer;


public class lastletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      String s1= sc.nextLine();
      StringTokenizer st= new StringTokenizer(s1," ");
      StringBuffer sb= new StringBuffer();

	  String s2= st.nextToken();
      sb.append(s2.substring(s2.length()-1).toUpperCase());
      while(st.hasMoreTokens())
      {
          sb.append("$");
    	  String s3= st.nextToken();
          sb.append(s3.substring(s3.length()-1).toUpperCase());
          
      }
      System.out.println(sb.toString());
      
      
	}

}
