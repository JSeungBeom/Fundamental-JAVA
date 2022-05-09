package outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "dlwlrma".getBytes();
		os.write(data); // 매개값으로 주어진 바이트 배열의 모든 바이트를 보냄
		os.flush();
		os.close();
	}

}
