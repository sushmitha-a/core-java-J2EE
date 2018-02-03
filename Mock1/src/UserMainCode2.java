
public class UserMainCode2 {

	public static int sumOfDigits(String str) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char o=str.charAt(i);
			if(Character.isDigit(o))
			{
			  int u = Character.getNumericValue(o);
			  sum=sum+u;
			}
			
			
		}
		
		
		
		return sum;
	}

}
