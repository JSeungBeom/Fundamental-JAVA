package reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[4]; // 크기 4의 char 배열
		// 입력 스트림으로부터 len 개의 문자를 읽고, cubf[off]부터 len 개까지 배열에 저장
		// 실제로 읽은 문자 수인 len 개를 리턴
		readCharNo = reader.read(cbuf, 1, 2);
		for(int i = 0; i < cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		
		reader.close();
	}
}
