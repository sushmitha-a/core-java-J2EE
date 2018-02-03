import java.util.Scanner;


public class maxspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int max=0;
		int a[]= new int[20];
		 for(int i=0;i<n;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(a[i]==a[j])
				 {
					 if((j-i)>max)
						 max=(j-i)+2;
				 }
			 }
		 }
		System.out.println(max);
		
		
		
		
		
	}

}
