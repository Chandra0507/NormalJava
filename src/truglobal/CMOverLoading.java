package truglobal;

public class CMOverLoading {
		/*public static void playr(int hscore) {
			System.out.println(hscore);
		}
		public  void player(int hscore,int lscore) {
			System.out.println(hscore+lscore);
		}
	public static void main(String[] args) {
		CMOverLoading cm=new CMOverLoading();
		cm.player(183, 88);
		cm.playr(183);
	}*/
	 CMOverLoading() {
		 int no=7;
		 System.out.println(no);
	}
	 CMOverLoading(String name){
		 name="mahi";
		 System.out.println(name);
	 }
	 public static void main(String[] args) {
		CMOverLoading cm=new CMOverLoading();
		
	}

}
