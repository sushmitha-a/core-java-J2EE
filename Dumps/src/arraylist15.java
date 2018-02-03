/*input1-List1-{apple,orange,grapes}
input2-List2-{melon,apple,mango}
output={mango,orange}
operation-- In 1st list remove strings starting with 'a' or 'g'
In 2nd list remove strings ending with 'n' or 'e'
Ignore case, return in string array*/
import java.util.*;
public class arraylist15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ArrayList<String> a1 = new ArrayList<String>();
ArrayList<String> a2 = new ArrayList<String>();
ArrayList<String> a3 = new ArrayList<String>();
StringBuffer sb = new StringBuffer();
for(int i=0;i<n;i++)
{
	a1.add(sc.next());
}
for(int i=0;i<n;i++)
{
	a2.add(sc.next());
}
for(int i=0;i<n;i++)
{
	String s2 = a1.get(i);
	if(s2.charAt(0)!='a'&&s2.charAt(0)!='g')
	{
		a3.add(s2);
	}
}
for(int j=0;j<n;j++)
{
	String s3 = a2.get(j);
	if(s3.charAt(s3.length()-1)!='n'&&s3.charAt(s3.length()-1)!='e')
	{
		a3.add(s3);
	}
	
}

System.out.println(a3);
	}
}





