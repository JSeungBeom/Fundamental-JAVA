package writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		// �־��� ���� �迭���� ��� ���ڸ� ����
		writer.write(data);
		writer.flush();
		writer.close();
	}
}
