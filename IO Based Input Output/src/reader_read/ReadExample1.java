package reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		// ���� ��� �Է� ��Ʈ���� �ֻ��� Ŭ���� Reader Ŭ���� (�߻� Ŭ����)
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readData;
		// int read() : �Է� ��Ʈ�����κ��� �Ѱ��� ������ �а� ����
		while((readData = reader.read()) != -1)
			System.out.println((char)readData);
		
		reader.close();
	}
}
