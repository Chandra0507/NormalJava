package truglobal;

public class VariableArgs {
		public static int add(int...a) {
			int sum=0;
		for(int k :a) {
			sum=sum+k;
		}
			return sum;
		}
	public static void main(String[] args) {
		VariableArgs va=new VariableArgs();
		System.out.println(va.add(1,2,3,4,20));
		
	}

}
