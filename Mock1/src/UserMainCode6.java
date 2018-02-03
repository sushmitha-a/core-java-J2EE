
public class UserMainCode6 {

	public static int addPrimeIndex(int[] a) {
		// TODO Auto-generated method stub
		int sum=0,k=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(i==0||i==1)
			{
				sum=sum+a[i];
				k++;
			}
			else
			{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			
			if(count>2)
			{
				sum=sum+a[i];
				k++;
			}
		}
			}
		}
		float avg = (float)sum/k;
		int y =(int)avg;
	return y;

}
}
