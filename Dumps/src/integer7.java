import java.util.Scanner;


public class integer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		a[i] = sc.nextInt();
		 int max=0,d=0;
           
		
		int len = a.length;
		int i = 0, j = 0, e = 0, count = 0;
		for (i = 0; i < len; i++) {
		for (j = i + 1; j < len; j++) {
		if(a[i]==a[j])
		{
		 d = j-i;
		}
		if(d>max)
			max=d;
		}

	}
		
		System.out.println(max+1);

	}
}
