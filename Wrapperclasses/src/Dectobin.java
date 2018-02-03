import java.util.Scanner;


public class Dectobin {
public static void main(String []args){
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	String b = Integer.toBinaryString(a);
	long res = Long.parseLong(b);
	System.out.println(res);
}
}
