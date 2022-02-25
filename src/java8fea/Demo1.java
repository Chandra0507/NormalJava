package java8fea;

interface Cab{
	public String booking(String source , String destination);
}
public class Demo1 {

	public static void main(String[] args) {
	Cab cab=(source,destination)->{
		System.out.println(source + "," +destination);
	return("price is 500");};
	System.out.println(cab.booking("Hyd", "chennai"));
	}

}
