import java.util.Scanner;


public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ss=0,so=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				ss+= arr[i]*arr[i];
			else
				so+=arr[i]*arr[i]*arr[i];
		}
		System.out.println(ss+so);
		
		}
		
	}


