package com.varhere.yoon016;

//import com.varxyz.jv300.mod004.File;
import java.io.File;

public class FileTest {
	private static final String SAVE_DIR = "/Users/here/Desktop/Here/temp";
	public static void main(String[] args) {
		File saveDir = new File(SAVE_DIR);
		System.out.println(saveDir.getPath());
		System.out.println("Window : " + File.separator);
	}
}
