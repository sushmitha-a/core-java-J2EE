
public class UserMainCode7 {
	public static int countSeven(int input1){
		int count=0;
		while(input1!=0)
		{
			int n = input1%10;
			if(n==7)
			count++;
			input1=input1/10;
			
		}
		
		
		return count;
		
	}

}
