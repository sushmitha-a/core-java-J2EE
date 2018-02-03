

  import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {
	
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s= br.readLine();
		if(UserMainCode1.testOrderVowels(s)==1)
		System.out.println("valid");
		else
		System.out.println("invalid"); 
		
	}

}
