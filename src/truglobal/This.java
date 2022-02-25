package truglobal;

public class This {
		String name;
		int id;
		float height;
		public This(String name,int id,float height) {
		this.name=name;
		this.id=id;
		this.height=height;
		}
	public static void main(String[] args) {
			This t=new This("dhoni", 7, 5.11f);
			System.out.println(t.name);
	}
	/*String name="mahi";
	int id=7;
	public void m1() {
		System.out.println("m1");
		this.m2();
	}
	public void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		This t=new This();
		t.m1();
	}*/

}
