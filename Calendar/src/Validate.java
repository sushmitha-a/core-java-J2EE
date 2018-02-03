import java.util.Scanner;


public class Validate {
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	String y= sc.next();
	String e= sc.next();
	int c =2015 ;
	int y1= Integer.parseInt(y);
	int e1= Integer.parseInt(e);
	if(c-y1>=e1){
		System.out.println("true");
	}
	else
		System.out.println("false");
} 
}
