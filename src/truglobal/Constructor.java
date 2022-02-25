package truglobal;

public class Constructor {
			Constructor(String team){
				System.out.println(team);
			}
	Constructor(String name,int jno){
				System.out.println(name+","+jno);
			}
			
			
	public static void main(String[] args) {
		Constructor t=new Constructor("chennai");
		Constructor c=new Constructor("mahi",7);
	Constructor c1=new Constructor("raina", 3);
	
	
	/*Constructor1(String name, int no, double height) {
	System.out.println(name + "," + no + "," + height);
}
Constructor1(String name, double height, int no) {
	System.out.println("this is 2nd consc");
}
public static void main(String[] args) {
	System.out.println("1st details");
	Constructor1 c = new Constructor1("vidya", 10, 5.6);
	System.out.println("--------------------------------------------");
	System.out.println("2nd person details");
	Constructor1 c2 = new Constructor1("amritha", 25, 5.4);
	Constructor1 c3=new Constructor1("ammi",7.7,7);
}*/

	
	}

}
