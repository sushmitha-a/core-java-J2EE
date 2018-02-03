import java.util.Scanner;

/*Given a method with a positive number as input.write a code to
calculate the sum of squares of individual digits of given
number.Return it as output.*/
public class integer1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while(i!=0)
		{
			int g = i%10;
			sum=sum+(g*g);
			i=i/10;
		}
		System.out.println(sum);
	}
}
