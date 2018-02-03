
public class UserMainCode3 {

	public static int calculateElectricityBill(String previousReading,
    		String currentReading,int costPerUnit){
		String s1 = previousReading.substring(5);
		
		String s2 = currentReading.substring(5);
		
		int t = Integer.parseInt(s1);
		
		int t1= Integer.parseInt(s2);

		int d= t1-t;
		int sum = d*costPerUnit;
				return sum;
		
		
		
	}
}
