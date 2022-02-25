package filehandlingdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\TG1689\\Downloads\\Tg.pdf";
		File file = new File(path);
		try {
		boolean flag =	file.createNewFile();
		if(flag) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file is already available");
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
	}
}
