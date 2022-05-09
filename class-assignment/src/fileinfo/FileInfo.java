// package fileinfo;

import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileInfo {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp"); // Temp ���丮�� ��η� �ϴ� File ��ü ����
		// ����� ���Ե� ���ϵ��� File �迭�� ����
		File files[] = dir.listFiles(); 
		
		for(File filedata : files) {
			// ����, file �迭�� ��Ұ� �������, ������ ������� �ʰ� �ǳ� ��
			if(filedata.isDirectory())
				continue;
			// getName �޼ҵ�� ��� ������ �̸��� ����
			System.out.println("< " + filedata.getName() + " >");
			InputStream is = new FileInputStream(filedata); // ������ �����͸� �о���� ��ü
			OutputStream os = System.out; // �ܼ� â�� ����� ����, OutputStream Ÿ�� System.out �ʵ� ����
			
			byte[] readBytes = new byte[300]; // �ѱ��� ����ϱ� ����, ��� �Է� ��Ʈ���� ����Ʈ�� ������ ����Ʈ �迭
			int readByteNo = is.read(readBytes); // ����Ʈ �迭�� ���� ����Ʈ���� �����ϰ�, ���� ����Ʈ�� ���� ����
			String data = new String(readBytes, 0, readByteNo); // readBytes �迭�� ��� ����Ʈ�� data�� ����
			byte[] hangulBytes = data.getBytes(); // String Ÿ�� data�� byte �迭�� ����
			os.write(hangulBytes); // ��� ����Ʈ �ڵ带 �ֿܼ� ��� ( �ֿܼ��� ���ڷ� ��ȯ�Ǿ� ��� )
			os.flush();
			System.out.println();
		}
	}

}
