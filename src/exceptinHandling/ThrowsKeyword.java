package exceptinHandling;

public class ThrowsKeyword {

	public static void main(String[] args)throws ArithmeticException {
			ThrowsKeyword th=new ThrowsKeyword();
			try {
			th.add();
			}
			catch(Throwable e) {
				System.out.println(e);
			}
			System.out.println("hloo");
	}
	public void add()throws ArithmeticException {
		System.out.println("this is a add method");
		div();
	}
	public static void div()throws ArithmeticException {
		int i=8/0;
	}
}
