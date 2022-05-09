package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");

		int readByteNo;
		byte[] readBytes = new byte[3]; // ũ�� 3�� byte �迭 ����
		String data = "";
		// ���� ����Ʈ���� �Ű������� �־��� ����Ʈ �迭�� �����ϰ� ����Ʈ �� ����
		while((readByteNo = is.read(readBytes)) != -1) // EOF�� �Էµ� ������
			// readBytes �迭���� readByteNo ũ���� �迭�� 0�� �ε������� String ��ü ����
			data += new String(readBytes, 0, readByteNo); 
		
		System.out.println(data);
		is.close();
	}

}
