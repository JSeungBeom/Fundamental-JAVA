package inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		// 문자 변환 보조 스트림, 소스 스트림이 바이트 기반 스트림이지만 데이터가 문자일 경우 사용
		Reader reader = new InputStreamReader(is); // InputStream 스트림을 인자로 받음
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}

}
