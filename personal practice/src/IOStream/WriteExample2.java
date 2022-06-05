package IOStream;

import java.io.*;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "dlwlrma".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}
}
