package outputstream_write;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes();
		// �־��� ����Ʈ �迭�� offset 1���� len 2�� �ش��ϴ� ũ�� ��ŭ�� ���� (lw)
		os.write(data, 1, 2); 
		os.flush();
		os.close();
	}

}
