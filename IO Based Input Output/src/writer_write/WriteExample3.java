package writer_write;

import java.io.FileWriter;
import java.io.Writer;
public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		// char �迭 data�� offset 1���� len 2�� �ش��ϴ� ũ�� ��ŭ�� ����
		writer.write(data, 1, 2);
		writer.flush();
		writer.close();
	}

}
