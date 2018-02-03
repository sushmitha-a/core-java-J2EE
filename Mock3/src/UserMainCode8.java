import java.util.ArrayList;
import java.util.Collections;


public class UserMainCode8 {

	public static String[] convertToStringArray(ArrayList<String> arraylist) {
		// TODO Auto-generated method stub
		Collections.sort(arraylist);
		String s1[] = new String[arraylist.size()];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=arraylist.get(i);
			
		}
		
		
		
		
		return s1;
	}

}
