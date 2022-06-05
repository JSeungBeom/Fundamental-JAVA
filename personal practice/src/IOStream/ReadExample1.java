package IOStream;

import java.io.*;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		int readByte;
		while((readByte = is.read()) != -1) {
			System.out.println((char)readByte);
		}
		
		is.close();
	}

}
