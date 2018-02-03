import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
    
public class Main7 {
	public static void main(String[] args) throws IOException {
	    int input1;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    input1=Integer.parseInt(br.readLine());
	    System.out.println(UserMainCode7.countSeven(input1));

	    }
}
