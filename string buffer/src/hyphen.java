import java.util.Scanner;
import java.util.StringTokenizer;


public class hyphen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String s= sc.nextLine();
       StringTokenizer st= new StringTokenizer(s,"-");
       StringBuffer sb = new StringBuffer();
       String s1 = st.nextToken();
       String s2 = st.nextToken();
       String s3 = st.nextToken();
     
      sb.append(s1.substring(0,2)).append("-").append(s1.substring(2)).append(s2.charAt(1)).
		append("-").append(s2.substring(1)).append(s3.charAt(0)).append("-").
		append(s3.substring(1)) ;
		
		System.out.println(sb.toString());
       
		
	}

}
