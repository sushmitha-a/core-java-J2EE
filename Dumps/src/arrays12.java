import java.util.Scanner;


public class arrays12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s1[]=new int[n];
		for(int i=0;i<n;i++)
        {
        	s1[i]=sc.nextInt();
        }
		for(int i=0;i<n-2;i++)
		{
			if(s1[i]==1&&s1[i+1]==2&&s1[i+2]==3)
			{
				l=1;
			}
		

			
		}
		if(l==1)
			System.out.println("true");

		else
			System.out.println("false");
	
	}

}
