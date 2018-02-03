
public class stringbuffer8 {
	
		public static void main(String[] args) {
		String s1="abcabcabcxxx";
		getvalues(s1);
		}
		public static void getvalues(String s1) {
		int count=0;
		for(int i=0;i<s1.length()-2;i++)
		{
		if((s1.charAt(i)==s1.charAt(i+1))&&(s1.
		charAt(i+1)==s1.charAt(i+2)))
		{
		count++;
		}
		}
		System.out.println(count);
		}
		}
