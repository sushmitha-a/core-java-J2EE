import java.util.Scanner;


public class Stringprcsng {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	String s2= sc.next();
	int n= sc.nextInt();
    String s3= s1.substring(n, n+1).toLowerCase() ;
    String s4= s2.substring(s2.length()-n,s2.length()-n+1);
  
    if(s3.equalsIgnoreCase(s4))
    	System.out.println("true");
    else 
    	System.out.println("false");
    
   
}
}
