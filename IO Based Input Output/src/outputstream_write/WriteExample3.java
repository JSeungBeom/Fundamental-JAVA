package outputstream_write;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes();
		// 주어진 바이트 배열의 offset 1부터 len 2에 해당하는 크기 만큼을 보냄 (lw)
		os.write(data, 1, 2); 
		os.flush();
		os.close();
	}

}
