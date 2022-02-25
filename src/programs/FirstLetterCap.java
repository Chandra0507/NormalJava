package programs;

public class FirstLetterCap {

	public static void main(String[] args) {
		String actual="chandra sekhar reddy";
//		String replaceString=actual.replaceAll("\\s{2,}" ," ").trim();
//		System.out.println(replaceString);
		String [] words=actual.split(" ");
		for(String s:words) {
			System.out.print(s.substring(0, 1).toUpperCase()+s.substring(1, s.length())+" ");
		}
	}

}
