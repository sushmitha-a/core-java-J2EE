import java.util.Scanner;

/*Validate Password
validation based on following criteria:
-> minimum length is 8
-> should contain any of these @/_/#
-> should not start with number/special chars(@/#/_)
-> should not end with special chars
-> can contain numbers,letters,special chars*/
public class regexp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s = "^[@|#|_][@|_|#]{1,}[@|#|_]$";
		if(s.matches(s))
			System.out.println("valid");
		else
			System.out.println("intvalid");
		/*	String s = sc.next();
		String s1 = "[@|_|#]+";
		String s2 = "^[@|#|_]";
		String s3 = "[@|#|_]$";
		if(s.matches(s1))
			System.out.println("1 true");
		else
			System.out.println("1 false");
		if(s.matches(s2))
			System.out.println(("2 true"));
		if(s.matches(s3))
			System.out.println("3 true");
	    if(!s.matches(s2)&&(s.matches(s1))&&!(s.matches(s3)))
	    {
	    	System.out.println("valid");
	    }
		
	    else
		System.out.println("invalid");*/
		
		
	}
}
