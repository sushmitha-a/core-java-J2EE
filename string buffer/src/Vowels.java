import java.util.Scanner;


public class Vowels {
public static void main(String []args){

	Scanner sc= new Scanner(System.in);
	String s= sc.next().toLowerCase();
	StringBuffer sb = new StringBuffer();
    String b= "aeiou";
	System.out.println("erjh");
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)==b.charAt(i))
			{
				sb.append(s.charAt(i));
				
			}
		}
		if(sb.toString().equals(b))
		
			System.out.println("1");
		
	
		else
			
	System.out.println("2");
}
}
