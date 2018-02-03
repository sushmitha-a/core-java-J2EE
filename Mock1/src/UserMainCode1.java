
public class UserMainCode1 {

	public static int getLuckySum(int in1, int in2, int in3) {
		// TODO Auto-generated method stub
          int sum=0;
         if(in1==13)
          sum=in3;
         else if(in2==13)
		sum=in1;
         else if(in3==13)
		sum=in1+in2;
		return sum;
	}

}
