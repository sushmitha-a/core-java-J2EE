import java.util.Scanner;


public class reversesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		StringBuffer sb= new StringBuffer(s);
		String p1=sb.reverse().toString();
		String res = p1.substring(n1,n1+n2);
		System.out.println(res);
	}

}
