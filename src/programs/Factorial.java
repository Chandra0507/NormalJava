package programs;

import javax.swing.GroupLayout.Alignment;
import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=5;i++) {
		fact=fact*i;	
		}
		System.out.println(fact);
	
	}

}
