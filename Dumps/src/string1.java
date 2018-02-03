import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class string1{
public static void main(String[] args) {
String s1="abc def abc def";
getvalues(s1);
}
public static void getvalues(String s1) {
char a[]=s1.toCharArray();
StringBuffer sb=new StringBuffer();
LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
for(int i=0;i<a.length;i++)
{
hs.add(a[i]);
}
Iterator<Character>itr=hs.iterator();
while(itr.hasNext())
{
char o=itr.next();
System.out.println(o);


sb.append(o);

}
System.out.println(sb);
}
}