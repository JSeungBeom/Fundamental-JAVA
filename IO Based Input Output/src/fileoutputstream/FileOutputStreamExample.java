package fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
// throws Exception : JVM���� ���ܸ� ó��
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/house.jpg";
		String targetFileName = "C:/Temp/house_copy.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		// FileOutputStream : OutputStream�� ���� Ŭ������, ��� ������ �����͸� ���Ͽ� ����Ʈ ������ ����
		FileOutputStream fos = new FileOutputStream(targetFileName);
		// FileOutputStream fos = new FileOutputStream(targetFileName, true); // ���� ���� ���� ������ �߰�
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush(); // ���ۿ� �����ִ� �����͸� ��� ���
		fos.close();
		fis.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
	}

}
