package outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "dlwlrma".getBytes();
		os.write(data); // �Ű������� �־��� ����Ʈ �迭�� ��� ����Ʈ�� ����
		os.flush();
		os.close();
	}

}
