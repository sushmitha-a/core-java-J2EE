
public class UserMainCode1 {

	public static int testOrderVowels(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				sb.append(a);
			}
		}
		System.out.println(sb.toString());
		String s1="aeiou";
		String s2=sb.toString();
		if(s2.equals(s1))
		return 1;
		else
			return -1;
		
		
	}
	
}
