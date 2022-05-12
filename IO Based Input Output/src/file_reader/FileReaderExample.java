package file_reader;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// FileReader : Reader�� ���� Ŭ����, �ؽ�Ʈ ���Ϸκ��� �����͸� �о� ����
		FileReader fr = new FileReader("C:/Temp/test3.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
