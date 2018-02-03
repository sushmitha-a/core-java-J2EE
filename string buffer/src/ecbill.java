import java.util.Scanner;


public class ecbill {
public static void main(String []args)
{
	Scanner sc =  new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int n= sc.nextInt();
	String p= s1.substring(s1.length()-5);
	int a1= Integer.parseInt(p);
	String m= s2.substring(s2.length()-5);
	int a2= Integer.parseInt(m);
	int res= Math.abs(a2-a1)*n;
	System.out.println(res);
			}
}
