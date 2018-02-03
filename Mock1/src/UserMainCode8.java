import java.util.ArrayList;
import java.util.Collections;


public class UserMainCode8 {
	public static boolean checkAnagram(String input1,String input2)
	{
		String s1= input1.toLowerCase();
		String s2= input2.toLowerCase();
		ArrayList<Character> a1= new ArrayList<Character>();
		ArrayList<Character> a2= new ArrayList<Character>();
		ArrayList<Character> a3= new ArrayList<Character>();
		a3.add(' ');
		
		for(int i=0;i<s1.length();i++)
		{
			a1.add(s1.charAt(i));
		}
	
		for(int i=0;i<s2.length();i++)
		{
			a2.add(s2.charAt(i));
		}
	    a1.removeAll(a3);
	    a2.removeAll(a3);
	    Collections.sort(a1);
	   
	    Collections.sort(a2);
	
	    if(a1.equals(a2))
	    return true ;	
	    else
		return false;
			
		}
}
