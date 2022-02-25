package exceptinHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		int [] a=new int [5];
		try {
			System.out.println(a[7]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("it is a finally block");
		}
		System.out.println("ends");
	}

}
