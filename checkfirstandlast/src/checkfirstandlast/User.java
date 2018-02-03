package checkfirstandlast;


	import java.util.StringTokenizer;
import java.util.StringTokenizer;

	public class User {
	public static int check(String s) {
	StringTokenizer st = new StringTokenizer(s, " ");
	int n = st.countTokens();
	String[] s1 = new String[n];
	int i = 0, value = 0;
	while (st.hasMoreTokens()) {
	s1[i] = st.nextToken();
	i++;
	}
	if (s1[0].equals(s1[i - 1]))
	value = s1[0].length();
	else
	value = s1[0].length() + s1[i - 1].length();
	return value;
	}
	}


