package IOStream;

import java.io.*;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes();
		os.write(data, 1, 2);
		os.flush();
		os.close();
	}
}
