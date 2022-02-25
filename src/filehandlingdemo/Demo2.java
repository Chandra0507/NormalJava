package filehandlingdemo;

import java.io.File;
import java.util.Arrays;

import collections.Array;

public class Demo2 {

	public static void main(String[] args) {
		String path = "C:\\Users\\TG1689\\Downloads";
		File file = new File(path);
	File [] dowdir	= file.listFiles();
	Arrays.sort(dowdir);
	for(File e : dowdir) {
	if(e.isFile()) {
		System.out.println("this is file"+  "  "  + e.getName());
	}
	else if(e.isDirectory()){
		System.out.println("this is directory "+ "  "+ e.getName());
	}
	else{
		System.out.println("not known"+ "  "+ e.getName());
	}
	}

}}
