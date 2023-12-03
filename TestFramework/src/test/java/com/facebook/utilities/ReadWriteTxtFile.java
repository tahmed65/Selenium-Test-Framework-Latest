package com.facebook.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteTxtFile {
	
	
	
	public void readFromTxtFile(String fileName) throws IOException {
		
		
		File file=new File("src/test/resources/testdata/"+fileName);
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String line=bufferReader.readLine();
		while(line != null) {
		System.out.println(line);
		line=bufferReader.readLine();
		}
		
			
	}
	
	
}
