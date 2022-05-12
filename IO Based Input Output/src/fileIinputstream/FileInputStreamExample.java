package fileIinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// IO Stream�� �̿��� ��, try-catch ������ ���� ó���� ���ְų�, main �Լ��� throws Exception��
		// ǥ���Ͽ�, �ݵ�� ����ó���� �ؾ� ��
		try {
			// FileInputStream : InputStream�� ���� Ŭ����, ��� ������ ������ ����Ʈ ������ ����
			FileInputStream fis = new FileInputStream("C:/FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
