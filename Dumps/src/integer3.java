import java.util.Scanner;

/*Given a method with a positive number as input. Write code to calculate the sum of digits at 
even indexes (say evenSum) and sum of digits at odd indexes (say oddSum). 
In the given number if both the sums are equal return 1 as output else return -1.*/
public class integer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int flag=0,sume=0,sumo=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0)
		{
			int h =n%10;
			if(flag==1)
			{
		      sumo=sumo+h;
		      flag=0;
			}
			else
			{
				sume=sume+h;
				flag=1;
			}
			n=n/10;	
			
		}
		
		
		System.out.println(sume);
		System.out.println(sumo);
		if(sumo==sume)
			System.out.println(1);
		else
			System.out.println(-1);
		
	}

}
