package truglobal;

public class Constructor1 {

	Constructor1(int a) {
		this();
		System.out.println("this is 2nd const");
	}

	public Constructor1() {

		System.out.println("this is 1st const");
	}

	Constructor1(String s) {
		this(10);
		System.out.println("it is 3rd one");
	}

	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1("ll");
	}
}
