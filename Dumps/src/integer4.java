import java.util.Scanner;

/* Given a method addPalindrome()with two inputs of type int.first input being the lower limit
 *  and
 second input  the higher limit of a range of postive integers.
Write a code to calubeinglate the sum of all palindrome numbers in this range including the two 
numbers.
if there is no any palindrome number in the given range,return0.
Note1:A palindrome number is a number which remains same after reversing its digits.
Note2:A single digit number is not considerd as palindrome.*/
public class integer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sump=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		for(int i=n;i<=r;i++)
		{
			int f=0;
			int g=i;
			int rev=0;
			while(g!=0)
			{
				 f = g%10;
				rev = rev*10+f;
				g=g/10;
			}
			if(rev==i)
			{
				sump=sump+i;
			}
			
			
		}
		
		System.out.println(sump);
		
		
		
	}

}
