package outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		// ����Ʈ ��� ��� ��Ʈ���� �ֻ��� Ŭ���� OutputStream
		// ��ü�� �����ϸ� �����͸� ������ ������ ��θ� ����
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes(); // String�� ����Ʈ �迭�� ����
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]); // ��� ��Ʈ������ 1����Ʈ �� ������
		}
		os.flush(); // ���ۿ� �ܷ��ϴ� ��� ����Ʈ ���
		os.close(); // ��� ��Ʈ�� �ݱ�
	}
}
