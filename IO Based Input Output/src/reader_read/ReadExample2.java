package reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[2]; // ũ�� 2�� char Ÿ�� �迭 ����
		String data = "";
		// read(char[] cbuf) : ���� ���ڵ��� �Ű������� ���� �迭�� �����ϰ�, ���� �� ����
		while((readCharNo = reader.read(cbuf)) != -1) // EOF�� �� �� ����
			data += new String(cbuf, 0, readCharNo);
		
		System.out.println(data);
		reader.close();
	}

}
