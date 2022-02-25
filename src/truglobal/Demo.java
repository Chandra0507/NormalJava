package truglobal;

public class Demo {
	int i=10;
	public static void main(String[] args) {
		System.out.println(new Demo().i);
		new Demo().i=20;
		System.out.println(new Demo().i);
		System.out.println(new Demo().i=30);
		System.out.println(new Demo().i);
	}

}
