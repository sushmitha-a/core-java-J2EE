import java.util.LinkedHashSet;


public class UserMainCode12 {
	public static int countCommonStrings(String[] words1,String[] words2)
	{
		int count=0;
	
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		for(int i=0;i<words1.length;i++)
		{
			hs.add(words1[i]);
			
		}
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		for(int i=0;i<words2.length;i++)
		{
			hs1.add(words2[i]);
			
		}
		for(String s1:hs)
		{
			
		for(String s2:hs1)
		{
			if(s1.equals(s2))
			{
				count++;
			}
		}
				
			
		}
		return count;
	}
}

	
