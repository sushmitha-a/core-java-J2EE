import java.util.*;
public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2 = sc.nextLine();
     ArrayList<Character> a1 = new ArrayList<Character>();
     ArrayList<Character> a2 = new ArrayList<Character>();
     for(int i=0;i<s1.length();i++)
     {
    	 a1.add(s1.charAt(i));
     }
     for(int i=0;i<s2.length();i++)
     {
    	 a2.add(s2.charAt(i));
     }
	
	Collections.sort(a1);
	Collections.sort(a2);
	ArrayList<Character> a3 = new ArrayList<Character>();
	a3.add(' ');
	a1.removeAll(a3);
	a2.removeAll(a3);
	String s3 = a1.toString();
	String s4 = a2.toString();
	if(s3.equalsIgnoreCase(s4))
	{
		
		System.out.println("true");
	}
	else
		System.out.println("false");
		
		
	}

}
