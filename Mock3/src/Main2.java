
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
    String input1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    input1=br.readLine();
    boolean output = UserMainCode2.validatePhone(input1);
    if(output)
    {
        System.out.println("TRUE");
    }
    else
        System.out.println("FALSE");
    }
    
}