
public class UserMainCode3 {

	public static int addSeries(int num) {
		// TODO Auto-generated method stub
		int sum=1,k=3,i=1;
            while(k<=num)
		{
			if(i%2!=0)
			{
				sum=sum+k;
			
			}
			else if(i%2==0)
			{
				sum=sum-k;
			}			
			k=k+2;
			i++;
		}
return sum;
}
}

