package writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		String data = "dlwlrma wook";
		writer.write(data); // 매개값으로 주어진 String을 전부 보냄
		// writer.write(data, 3, 2); // 매개값으로 주어진 String의 3번 offset부터 len 개까지 보냄 
		writer.flush();
		writer.close();
	}

}
