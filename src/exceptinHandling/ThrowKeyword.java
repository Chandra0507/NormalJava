package exceptinHandling;

public class ThrowKeyword {

	public static void main(String[] args)  {
		System.out.println("hii");
		try {
		throw new Exception("this is my own exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		String rno=" ";
		if(rno.equals(rno)) {
			try {
				throw new Exception("null exception");
				}
				catch(Exception e) {
					e.printStackTrace();
		}
		System.out.println("hloo");
	}

}}
