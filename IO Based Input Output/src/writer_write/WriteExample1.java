package writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		// ���� ��� ��� ��Ʈ���� �ֻ��� Ŭ���� Writer
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		// write() : ��� ��Ʈ������ �Ű������� �־��� �� ���ڸ� ������
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
