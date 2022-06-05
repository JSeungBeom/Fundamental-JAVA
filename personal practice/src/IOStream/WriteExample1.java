package IOStream;

import java.io.*;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes();
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
