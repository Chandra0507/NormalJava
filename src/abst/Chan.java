package abst;

public interface Chan{
	void m1();
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.m1();
		d.m2();
	}
}
interface Demo1{
	void m2();
}
class Demo2 extends Object{

	public void m2() {
		System.out.println("111");
	}
	public void m1() {
		System.out.println("2222");
	}
	
}

