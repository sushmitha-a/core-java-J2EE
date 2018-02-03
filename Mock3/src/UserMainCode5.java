import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class UserMainCode5 {

	 public static int getElementPosition(String[] array,String str) {
		// TODO Auto-generated method stub
		 int id=1;
		 ArrayList<String> al1 = new ArrayList<String>();
		 
		for(int i=0;i<array.length;i++)
		{
			al1.add(array[i]);
		}
		Collections.sort(al1);
		Collections.reverse(al1);
		
		for(int i=0;i<al1.size();i++)
		{
			String s2 = al1.get(i);
			if(str.equals(s2))
			 id = i;
			
		}
		return id+1;
		
	}

}
