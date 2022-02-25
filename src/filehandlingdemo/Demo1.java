package filehandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\TG1689\\Downloads\\sam.pdf.pdf");
		File opFile = new File("C:\\Users\\TG1689\\Downloads\\sam-copy.pdf");
		FileInputStream finputstream = null;
		FileOutputStream foutputstream = null;
		try {
			finputstream = new FileInputStream(file);
			foutputstream = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(finputstream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 0;
		try {
			while((i = finputstream.read()) != -1) {
				foutputstream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(finputstream !=null) {
				try {
					foutputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(foutputstream !=null) {
				try {
					foutputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
