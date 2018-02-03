import java.util.Scanner;

/*Given a method with a string and a positive int (say n) as input. Write code to construct a 
  string with first n and last n characters in the given string.
Note- the given string length is >= 2n.*/
public class stringbuffer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(0,a));
		sb.append(s.substring(s.length()-a));
		System.out.println(sb.toString());
		
		
		
	}

}
