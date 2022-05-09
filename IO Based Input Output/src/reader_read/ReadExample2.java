package reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[2]; // 크기 2의 char 타입 배열 생성
		String data = "";
		// read(char[] cbuf) : 읽은 문자들을 매개값으로 문자 배열에 저장하고, 문자 수 리턴
		while((readCharNo = reader.read(cbuf)) != -1) // EOF가 될 때 까지
			data += new String(cbuf, 0, readCharNo);
		
		System.out.println(data);
		reader.close();
	}

}
