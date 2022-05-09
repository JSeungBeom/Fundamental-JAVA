package reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		// 문자 기반 입력 스트림의 최상위 클래스 Reader 클래스 (추상 클래스)
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readData;
		// int read() : 입력 스트림으로부터 한개의 문자을 읽고 리턴
		while((readData = reader.read()) != -1)
			System.out.println((char)readData);
		
		reader.close();
	}
}
