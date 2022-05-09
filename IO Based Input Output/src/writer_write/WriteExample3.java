package writer_write;

import java.io.FileWriter;
import java.io.Writer;
public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		// char 배열 data의 offset 1부터 len 2에 해당하는 크기 만큼을 보냄
		writer.write(data, 1, 2);
		writer.flush();
		writer.close();
	}

}
