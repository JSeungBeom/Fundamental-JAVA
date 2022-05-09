package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[8]; // ũ�� 8�� byte �迭
		// readBytes �迭�� offset 2���� len 3 ��ŭ �Է� ��Ʈ������ ���� �а� ����
		readByteNo = is.read(readBytes, 2, 3);
		for(int i = 0; i < readBytes.length; i++)
			System.out.println((char)readBytes[i]);
		
		is.close();
		
	}

}
