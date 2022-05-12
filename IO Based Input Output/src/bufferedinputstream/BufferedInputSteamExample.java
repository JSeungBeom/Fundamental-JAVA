package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputSteamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Temp/forest.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� ��: " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:/Temp/forest.jpg");
		// ���� ��� ���� ��Ʈ��, ����� �ҽ��� ���� �۾��ʰ� ���ۿ� �۾� 
		BufferedInputStream bis = new BufferedInputStream(fis1);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� ��: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}

}
