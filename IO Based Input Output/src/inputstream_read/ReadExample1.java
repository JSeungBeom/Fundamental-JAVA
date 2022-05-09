package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	// throws Exception�� ����, 
	// read()���� throw�� Exception�� main���� ó������ �ʰ� �ٽ� throw (��ź ������)
	public static void main(String[] args) throws Exception{
		// ����Ʈ ��� �Է� ��Ʈ���� �ֻ��� Ŭ���� InputStream
		InputStream is = new FileInputStream("C:/Temp/test.txt");
	//  InputStream is = new FileInputStream("C:\\Temp\\test.txt");
    //  �� ������ ��� ���, �� ������ �� ���� ����Ͽ��� ǥ���� ���� (\t, \r ��� ȥ��)
		
		int readByte;
		// int read() : �Է� ��Ʈ������ ���� 1 ����Ʈ�� �а� ����
		while((readByte = is.read()) != -1)  // -1, �� EOF�� �� ������ (�ڵ� ���� -1 != ���� �������� -1)
			System.out.println((char)readByte); // int Ÿ���� readByte�� char Ÿ������ �ٿ� ĳ����
		
		is.close(); // �Է� ��Ʈ�� �ݱ�
	}
}
