
public class UserMainCode10 {

	public static boolean validateString(String word)
	{
		char c= word.charAt(0);
		if(!Character.isDigit(c))
				return true;
		
		return false;
		
	}

}
