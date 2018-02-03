import java.util.Scanner;

/* Retrieve the odd numbers till given input number. 
 add and subtract it consecutively and return the result.*/
public class arraylist12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=a[0];
		for(int i=1;i<n;i++)
		{
			
			
			
			if(i%2==0)
				sum=sum-a[i];
			else 
				sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
	}

}
