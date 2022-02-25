package exceptinHandling;

public class UnChecked {

	/*public static void main(String[] args) {
		try {
			String s="mahi";
			s.charAt(10);
			System.out.println(s);
	}
//		catch(StringIndexOutOfBoundsException e){
//			System.out.println(e);
//		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
			System.out.println("ends");
	}*/
	public static void main(String[] args) {
		try {
			String s="mahi";
			s.charAt(10);
			System.out.println(s);
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
	}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
			System.out.println("ends");
	}
}
