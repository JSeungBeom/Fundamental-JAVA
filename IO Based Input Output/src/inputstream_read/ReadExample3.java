package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[8]; // 크기 8의 byte 배열
		// readBytes 배열에 offset 2부터 len 3 만큼 입력 스트림으로 부터 읽고 저장
		readByteNo = is.read(readBytes, 2, 3);
		for(int i = 0; i < readBytes.length; i++)
			System.out.println((char)readBytes[i]);
		
		is.close();
		
	}

}
