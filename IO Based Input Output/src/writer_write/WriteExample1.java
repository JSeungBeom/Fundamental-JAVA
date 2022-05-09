package writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		// 문자 기반 출력 스트림의 최상위 클래스 Writer
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		// write() : 출력 스트림으로 매개값으로 주어진 한 문자를 보낸다
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
