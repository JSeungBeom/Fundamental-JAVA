package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");

		int readByteNo;
		byte[] readBytes = new byte[3]; // 크기 3의 byte 배열 생성
		String data = "";
		// 읽은 바이트들은 매개값으로 주어진 바이트 배열에 저장하고 바이트 수 리턴
		while((readByteNo = is.read(readBytes)) != -1) // EOF가 입력될 때까지
			// readBytes 배열에서 readByteNo 크기의 배열을 0번 인덱스부터 String 객체 생성
			data += new String(readBytes, 0, readByteNo); 
		
		System.out.println(data);
		is.close();
	}

}
