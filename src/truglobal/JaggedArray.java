package truglobal;

public class JaggedArray {

	public static void main(String[] args) {
		int arr [][]= {
				{1,2,3,4},
				{5,6,7},
				{9,8,0,5,6,7}
						};
//		for( int [] a: arr) {
//			for(int b: a) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
