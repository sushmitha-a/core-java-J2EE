import java.util.Scanner;

public class integer11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String is=s.next();
		
	
		int k=10,sum=0;
		int sb = Integer.parseInt(is);
	    while(sb!=0)
	    {
	    	int u = sb%10;
	    	sum=sum+(u*k);
	        k--;
	    	sb=sb/10;
	    }
		if(sum%11==0)
			System.out.println("true");
		else
		   System.out.println("false");
	}
}
