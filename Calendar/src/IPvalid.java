import java.util.Scanner;
import java.util.StringTokenizer;


public class IPvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s4=s.next();
		StringTokenizer st=new StringTokenizer(s4,".");
		if(s4.matches("[0-9]{3}(.)[0-9]{3}(.)[0-9]{3}(.)[0-9]{3}")){
		String a=st.nextToken();
		int a1=Integer.parseInt(a);
		String b=st.nextToken();
		int b1=Integer.parseInt(b);
		String c=st.nextToken();
		int c1=Integer.parseInt(c);
		String d=st.nextToken();
		int d1=Integer.parseInt(d);
		if(a1>0 && a1<255 && b1>0 && b1<255 && c1>0 && c1<255 && d1>0 && d1<255){
		System.out.println("valid input");
		}
		else
		System.out.println("invalid input");
		}
		
		else
			System.out.println("invalid token");
	}

}
