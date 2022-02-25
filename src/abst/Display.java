package abst;

public interface Display {
	public abstract void m1();

	public void m2();

	 public static void m3() {
		 
	 }
}
	class Demo implements Display {
		public void m1() {
			System.out.println("this is m1");
		}

		public void m2() {
			System.out.println("this is m2");

		}

		public static void main(String[] args) {
			Demo d = new Demo();
			d.m1();
			d.m2();
		}

	}

