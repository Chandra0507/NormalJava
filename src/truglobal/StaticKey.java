package truglobal;

public class StaticKey {
	String teamName;
	String captain;
	String player;
	static String coach;
	public StaticKey(){
		System.out.println("in cons");
		teamName="a";
		captain="b";
	}
	static {
		System.out.println("in static");
		coach="mmm";
	}
	static {
		System.out.println("in static block");
		//coach="mmm";
	
	} 
	public void data() {
		System.out.println(teamName +","+ captain +","+ player +","+ coach);
	}
	public static void main(String[] args) {
		StaticKey mahi=new StaticKey();
//		mahi.teamName="CSK";
//		mahi.captain="Mahi";
//	 	mahi.player="Raina";
//		mahi.coach="Flemming";
		StaticKey raina=new StaticKey();
//		raina.teamName="csk";
//		raina.captain="mahi";
//		raina.player="faf";
//		coach="flem";
		
		raina.data();
		mahi.data();
		
	}

}
