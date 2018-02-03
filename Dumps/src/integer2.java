import java.util.Scanner;
/*Given a method calulateNcr().Write cod to calculate the ways in which r elements can be 
 * selected
from n population,using nCr formulanCr=n!/r!(n-r)! where first input begin n and 
second input being r.
Note:n!factorial can be achieved using given formula n!=n x (n-1)x(n-2)x...3x2x1.
*/
public class integer2 {
	public static void main(String[] args) {
		int fa=1 ,fa1=1,fa2=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
	    for(int i=n;i<=1;i--)
	    {
	    	fa =fa*i;
	    }
	    
	    for(int i=r;i<=1;i--)
	    {
	    	fa1 =fa1*i;
	    }
	    int h =n-r;
	    for(int i=h;i<=1;i--)
	    {
	    	fa2 =fa2*i;
	    }
		
	    int res = fa/(fa1*fa2);
	    
	    System.out.println(res);
	    
	}
}
	