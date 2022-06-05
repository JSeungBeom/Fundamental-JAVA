package SupplementaryStream;

import java.io.*;

public class OSWEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "dasds";
		writer.write(data);
		
		writer.flush();
		writer.close();
	}

}
