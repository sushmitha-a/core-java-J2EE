import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main12 {
	public static void main(String[] args) {
		int num1,num2,count;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			num1=Integer.parseInt(br.readLine());			
			String[] word1=new String[num1];
			for(int i=0;i<num1;i++)
			{
				word1[i]=br.readLine();
			}
			num2=Integer.parseInt(br.readLine());
			String[] word2=new String[num2];
			for(int i=0;i<num2;i++)
			{
				word2[i]=br.readLine();
			}
			count=UserMainCode12.countCommonStrings(word1, word2);
			System.out.println(count);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
