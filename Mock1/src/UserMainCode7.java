
public class UserMainCode7 {
	public static int getLargestSpan(int[] input){
		int v=0,max=0;
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=1;j<input.length;j++)
			{
				if(input[i]==input[j])
				{
					 v= j-i+1;
					if(v>max)
						max=v;
				}
			}
			
			
		}
		return max;
	}
}
