import java.util.Scanner;


public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,res=0,i;
		int a[]= new int[20];
		Scanner sc= new Scanner(System.in);
		 n= sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			 res+= (int)Math.pow(a[i],i);
		}
		System.out.println(res);
	}

}
